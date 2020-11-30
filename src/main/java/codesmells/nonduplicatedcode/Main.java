package codesmells.nonduplicatedcode;

import codesmells.model.Item;
import codesmells.model.Order;

public class Main {
    public static void main( String[] args ) { 
    	NonDuplicatedCode feature = new NonDuplicatedCode();
        
        Order order = new Order("Informatica");
        
        Item item1 = new Item("Computador Dell", 3000.0);
        Item item2 = new Item("Notebook Lenovo", 2000.0);
        Item item3= new Item("Tablet Samsung", 800.0);
        
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        
        double start = System.currentTimeMillis();
        
        feature.printOrder(order);
        
        double end = System.currentTimeMillis();
        
        System.out.println("\n\nTempo de execucao: " + (end - start));
    }  
}