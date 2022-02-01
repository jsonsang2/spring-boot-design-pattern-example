package com.example.springbootdesignpatternexample.model.Iterator;

import java.awt.*;

public class DinerMenu {

    MenuItem[] menuItems;

    /*
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    */

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
