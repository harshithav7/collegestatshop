package com.geektrust.backend.commands;

import com.geektrust.backend.constants.Constants;
import com.geektrust.backend.exceptions.NoSuchCommandException;
import com.geektrust.backend.services.IApartmentBillService;
import java.util.List;

public class AddItemCommand implements ICommand{
    private final Product Categary;

    public AddItemCommand(Catogery ) {
        this.Product = Product;
    }

    @Override
    public void execute(List<String> tokens) {
        try {
        Product.addGuestToApartment(Integer.valueOf(tokens.get(Constants.ONE)));
        } catch (NoSuchCommandException e) {
            System.out.println("Invalid Command");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
