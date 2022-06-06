package com.lzb.refactor.coffee;

import java.io.IOException;

/**
 * <br/>
 * Created on : 2022-06-06 23:33
 *
 * @author lizebin
 */
public class CoffeeMachineMock extends CoffeeMachine {

    public static void run(String input) {
        addAllIngredients();
        addAllDrinks();
        updateCosts();
        updateMakeable();
        display();
        startIO(input);
    }

    public static void startIO(String input) {
        try {
            if (input.equals("")) {
                return;
            }
            if (input.equals("q")) {
                System.exit(0);
            } else if (input.equals("r")) {
                restockIngredients();
                updateMakeable();
            } else if (Integer.parseInt(input) > 0 && Integer.parseInt(input) <= drinkList.size()) { //dynamic drink menu selection
                makeDrink(drinkList.get(Integer.parseInt(input) - 1));
            } else {
                throw new IOException(); //legal, but invalid input
            }
        } catch (Exception e) {
            System.out.print("Invalid selection: " + input + ". Try again: "); //illegal input
        }
    }

}
