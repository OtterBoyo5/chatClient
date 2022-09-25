package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> menuItems;

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
        updateLastUpdateTime();
    }

    public void addItem(PizzaMenuItem toAdd){
        menuItems.add(toAdd);
        updateLastUpdateTime();
    }
    public void removeItem(PizzaMenuItem toRemove){
        menuItems.remove(toRemove);
        updateLastUpdateTime();
    }
    public List<PizzaMenuItem> getMenuItems(){
        return menuItems;
    }

    private void updateLastUpdateTime() {
        lastUpdate = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object obj) {
        PizzaMenu objMenu = (PizzaMenu) obj;
        if(menuItems.size() != objMenu.getMenuItems().size())
            return false;
        for (int i = 0; i < menuItems.size(); i++) {
            PizzaMenuItem currentMenuPizza = menuItems.get(i);
            PizzaMenuItem otherMenuPizza = objMenu.getMenuItems().get(i);

            if(!currentMenuPizza.equals(otherMenuPizza))
                return false;
        }
        return true;
    }
}