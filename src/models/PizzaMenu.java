package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {

    private List<PizzaMenuItems> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
        lastUpdate = LocalDateTime.now();
    }

    public void addItem(PizzaMenuItems toAdd){
        menuItems.add(toAdd);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(PizzaMenuItems toRemove){
        menuItems.remove(toRemove);
        updateLastUpdateTime();
    }



}
