package com.easyProgramming.itemService.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Item", namespace = "com.easyProgramming.item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    private Long id;
    private String name;

    public Item(){}

    public Item(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name=" + name + '}';
    }
}
