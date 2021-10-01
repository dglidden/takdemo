package com.jeojck.takdemo.repository;

import com.jeojck.takdemo.entity.HateItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HateRepository extends CrudRepository <HateItem, Long> {
    List<HateItem> findAll();
    HateItem findById(long id);
    List<HateItem> findByName(String name);
}
