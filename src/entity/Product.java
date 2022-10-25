/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
import java.util.Arrays;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String brand;
    private int razner;
          
    
    
    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRazner() {
        return razner;
    }

    public void setRazner(int razner) {
        this.razner = razner;
    }

    @Override
    public String toString() {
        return "Tovar{" + "название=" + name 
                        + ", цена=" + price 
                        + ", кол-во=" + quantity 
                        + ", бренд=" + brand   
                        + ", размер=" + razner 
                        + '}';
    }

    
}
