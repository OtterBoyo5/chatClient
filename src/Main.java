import models.PizzaMenu;
import models.PizzaMenuItems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello world again!");
        System.out.println("Hello world again!");

        int num = 10;
        int num2 = 15;
        int num3 = num; //int a primitivni datove typy vytvori novou vec

        if(num == num2) {
            System.out.println("same");
        }
        else {
            System.out.println("not the same");
        }

        boolean b = num == num2;

        String text = "aaa";

        String text2 = "aaa";

        if (text.equals(text2)){
            System.out.println("text same");
        }

        PizzaMenuItems pizzaItem1 = new PizzaMenuItems("Hawai", 180);
        PizzaMenuItems pizzaItem2 = new PizzaMenuItems("Hawai", 180);
        PizzaMenuItems pizzaItem3 = pizzaItem1;

        if (pizzaItem1 == pizzaItem2) {
            System.out.println("1: pizzas are same");
        }

        if (pizzaItem1 == pizzaItem3) {
            System.out.println("2: pizzas are same");
        }

        pizzaItem3.setPrice(200);
        System.out.println("3: "+pizzaItem1.getPrice());

        int[] intArr = new int[] {1,2,3,4,5};

        PizzaMenuItems[] pizzaArr = new PizzaMenuItems[]{
                new PizzaMenuItems("Hawai",180);
                new PizzaMenuItems("Polo",190);
        };

        List<PizzaMenuItems> pizzaList = new ArrayList<>();
        pizzaList.add(new PizzaMenuItems("Hawai",180));
        pizzaList.add(new PizzaMenuItems("Polo",190));

        for (int i = 0; i < pizzaList.size(); i++) {
            System.out.println(pizzaList.get(i));
        }

        for (PizzaMenuItems pizza:
             pizzaList) {
            System.out.println(pizza.toString());
        }


        PizzaMenu menu1 = new PizzaMenu();
        for (int i = 0; i <= 5 ; i++) {
            menu1.addItem((new PizzaMenuItems("Pizza", 150 + (i*10))));
        }

    }
}