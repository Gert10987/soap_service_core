package com.easyProgramming.itemService.control;

import com.easyProgramming.itemService.model.Item;
import com.easyProgramming.itemService.model.ItemServiceRegisterResponse;
import com.easyProgramming.itemService.repository.Component;
import com.easyProgramming.itemService.repository.IItemRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Random;

@Component
@Stateless
public class ItemServiceControl implements IItemRepository{

    private List<Item> items;
    private Random random;

    @Inject
    public ItemServiceControl(@Named("random") Random random, @Named("items") List<Item> items) {

        this.items = items;
        this.random = random;
    }

    @Override
    public Item checkItem(Long id) {
        return items
                .stream()
                .filter((item) -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public ItemServiceRegisterResponse registerItem(Item item) {

        ItemServiceRegisterResponse itemServiceRegisterResponse = new ItemServiceRegisterResponse();

        if(!items.stream()
                .anyMatch((i) -> i.getId().equals(item.getId()))){

            items.add(item);

            String generatedId = item.getId().toString() + "/" + random.nextLong();

            itemServiceRegisterResponse.setDescription("Register successfully");
            itemServiceRegisterResponse.setItemId(generatedId);

        }else{
            itemServiceRegisterResponse.setDescription("Register failed");

        }
        return itemServiceRegisterResponse;
    }
}
