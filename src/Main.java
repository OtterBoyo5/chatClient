import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello world again!");
        System.out.println("Hello world again!");

        int num = 10;
        int num2 = 15;
        int num3 = num;

        if(num == num2){
            //System.out.println("same");
        }
        else{
            //System.out.println("not same");
        }

        boolean b = num == num2;

        String text = "aaa";
        String text2 = "aaa";

        if(text.equals(text2)){
            //System.out.println("text same");
        }

        PizzaMenuItem pizzaItem1 = new PizzaMenuItem("Hawai", 180);
        PizzaMenuItem pizzaItem2 = new PizzaMenuItem("Hawai", 180);
        PizzaMenuItem pizzaItem3 = pizzaItem1;

        if(pizzaItem1 == pizzaItem2){
            System.out.println("1: pizza same");
        }
        if(pizzaItem1 == pizzaItem3){
            System.out.println("2: pizza same");
        }

        pizzaItem3.setPrice(200);

        System.out.println("3: "+pizzaItem1.getPrice());


        int[] intArr = new int[] {1,2,3,4,5};

        PizzaMenuItem[] pizzaArr = new PizzaMenuItem[]{
                new PizzaMenuItem("Hawai", 180),
                new PizzaMenuItem("Polo", 190)
        };

        List<PizzaMenuItem> pizzaList = new ArrayList<>();
        pizzaList.add(new PizzaMenuItem("Hawai", 180));
        pizzaList.add(new PizzaMenuItem("Polo", 190));

        for (int i = 0; i < pizzaList.size(); i++) {
            System.out.println(pizzaList.get(i));
        }

        for (PizzaMenuItem pizza :
                pizzaList) {
            System.out.println(pizza.toString());
        }


        PizzaMenu menu1 = new PizzaMenu();
        for (int i = 1; i <= 5; i++) {
            menu1.addItem(new PizzaMenuItem("Pizza "+i, 150 + (i*10)));
        }

        for (PizzaMenuItem pizza :
                menu1.getMenuItems()) {
            System.out.println(pizza);
        }
        System.out.println("Last update: " + menu1.getLastUpdate());

        PizzaMenu menu2 = new PizzaMenu();
        for (int i = 1; i <= 5; i++) {
            menu2.addItem(new PizzaMenuItem("Pizza "+i, 150 + (i*10)));
        }

        if(menu1.equals(menu2)){
            System.out.println("menu match");
        }

    }
}