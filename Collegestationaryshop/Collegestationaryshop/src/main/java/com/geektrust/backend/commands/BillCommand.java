package com.geektrust.backend.commands;

import com.geektrust.backend.exceptions.NoSuchCommandException;
import com.geektrust.backend.services.IApartmentBillService;

import java.util.List;

public class BillCommand implements ICommand{

    private final Product Categary;

    public BillCommand(Product Categary) {
        this.Product = Product;
    }

    @Override
    public void execute(List<String> tokens) {
        try {
            System.out.println(Product.calculateBillForProduct());
        } catch (NoSuchCommandException e) {
            System.out.println("Invalid Command");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
