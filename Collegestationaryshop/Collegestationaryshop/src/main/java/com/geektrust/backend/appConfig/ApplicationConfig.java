package com.geektrust.backend.appConfig;

import com.geektrust.backend.commands.*;
import com.geektrust.backend.services.Categary;
import com.geektrust.backend.services.Product;

public class ApplicationConfig {

    private final Product Product=new Product();
    private final Categary Categary=new Categary(Product);
    private final AddItemCommand addItemCommand=new AddItemCommand(Categary);
    private final BillCommand billCommand=new BillCommand(AddItemCommand);
    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        
        commandInvoker.register("ADD_ITEM",addItemCommand);
        commandInvoker.register("BILL",billCommand);
        return commandInvoker;
    }
}
