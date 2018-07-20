package com.easyProgramming.itemService.control;

import com.easyProgramming.itemService.model.Item;
import com.easyProgramming.itemService.repository.Component;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Component
public class ItemServiceControl {

    private List<Item> items;

    public ItemServiceControl() {

        items = new ArrayList<>();

        items.add(new Item(1L));
        items.add(new Item(2L));
    }

    public Item checkItem(Long id) {
        return items
                .stream()
                .filter((item) -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
