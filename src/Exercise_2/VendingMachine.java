package Exercise_2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VendingMachine {
    //region Properties
    HashMap<Products,List<Integer>> productsAndQuantity;
    Converter converter = new Converter();
    //end Properties

    //region Constructors
    public VendingMachine() {
    }
    //end Constructors

    //region methods
    Products getProducts(Command command) {

        List<Integer> quantity = new LinkedList<>();
        int i=10;
        while (i != 0) {
            quantity.add(1);
            i--;
        }

        productsAndQuantity = new HashMap<>();
        productsAndQuantity.put(Products.PEPSI,quantity);
        productsAndQuantity.put(Products.COLA,quantity);
        productsAndQuantity.put(Products.FANTA,quantity);

        productsAndQuantity.put(Products.LAYS,quantity);
        productsAndQuantity.put(Products.DORITOS,quantity);
        productsAndQuantity.put(Products.HZOR_CHIPS,quantity);

        productsAndQuantity.put(Products.MARS,quantity);
        productsAndQuantity.put(Products.SNICKERS,quantity);
        productsAndQuantity.put(Products.BOUNTY,quantity);

        CheckCommand givenCommand = new CheckCommand();
        boolean commandValidation = givenCommand.commandValidation(command);
        if(commandValidation){
            //return object of the product;
        } else {
            System.out.println("Command is wrong");
            // return catched exception
        }
        // return smt.
    }

    void printBoard(){
        for(Products product: productsAndQuantity.keySet()){
            System.out.println(product + "  " + productsAndQuantity.get(product));
        }
    }
    //end methods
}
