package com.jeojck.takdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HateItem {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    Long id;

    String name;

    protected HateItem() { }

    public HateItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("HateItem{id=%d, name='%s'}'", this.id, this.name);
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
