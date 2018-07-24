package com.easyProgramming.itemService.repository;

import com.easyProgramming.itemService.model.Item;
import com.easyProgramming.itemService.model.ItemServiceRegisterResponse;

public interface IItemRepository {

    Item checkItem(Long id);

    ItemServiceRegisterResponse registerItem(Item item);
}
