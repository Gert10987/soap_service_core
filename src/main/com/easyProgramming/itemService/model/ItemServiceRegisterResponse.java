package com.easyProgramming.itemService.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemServiceRegisterResponse", namespace = "com.easyProgramming.itemServiceRegisterResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemServiceRegisterResponse {

    private String description;
    private String itemId;

    public ItemServiceRegisterResponse(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "ItemServiceRegisterResponse{"
                + "description=" + description
                + ", itemId=" + itemId + '}';
    }
}
