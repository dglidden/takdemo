package com.jeojck.takdemo.controller;

import com.jeojck.takdemo.entity.HateItem;
import com.jeojck.takdemo.repository.HateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HateController {

    private static final Logger log = LoggerFactory.getLogger(HateController.class);

    @Autowired
    HateRepository repo;

    @ModelAttribute("allItems")
    public List<HateItem> allItems() {
        log.info(String.valueOf(repo.findAll()));
        return repo.findAll();
    }

    @ModelAttribute("item")
    public HateItem item() {
        return new HateItem("");
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute HateItem item, BindingResult errors, Model model) {
        repo.save(item);
        return "redirect:/";
    }
}
