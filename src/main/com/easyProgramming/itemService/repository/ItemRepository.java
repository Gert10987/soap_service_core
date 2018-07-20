package com.easyProgramming.itemService.repository;

import com.easyProgramming.itemService.model.Item;

public interface ItemRepository {

    Item checkItem(Long id);
}
