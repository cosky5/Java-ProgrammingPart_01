/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ficonic Terry
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    
    public Product(String name, double price, int amount){
        this.amount = amount;
        this.name = name;
        this.price = price;
    }
    
    
    public void printProduct() {
       System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
    
}
