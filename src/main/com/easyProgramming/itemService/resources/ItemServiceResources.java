package com.easyProgramming.itemService.resources;

import com.easyProgramming.itemService.model.Item;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Stateless
public class ItemServiceResources {

    @Produces
    @Named("random")
    public Random getRandom() {
        return new Random();
    }

    @Produces
    @Named("items")
    public List<Item> items(){
        return new ArrayList<>();
    }
}
