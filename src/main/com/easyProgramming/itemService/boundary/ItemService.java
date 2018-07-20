package com.easyProgramming.itemService.boundary;

import com.easyProgramming.itemService.control.ItemServiceControl;
import com.easyProgramming.itemService.model.Item;
import com.easyProgramming.itemService.repository.Component;
import com.easyProgramming.itemService.repository.ItemRepository;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "ItemService", serviceName = "ItemService",
        portName = "ItemService",
        targetNamespace = "http://easyProgramming.com")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ItemService implements ItemRepository{

    @Inject
    @Component
    private ItemServiceControl itemServiceControl;

    @WebMethod(operationName = "checkItem")
    @WebResult(name = "Item")
    @Override
    public Item checkItem(@WebParam(name = "itemId") Long id) {
        return itemServiceControl.checkItem(id);
    }
}