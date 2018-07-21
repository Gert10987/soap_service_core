package com.easyProgramming.itemService.repository;

import com.easyProgramming.itemService.model.Item;

public interface IItemRepository {

    Item checkItem(Long id);
}
