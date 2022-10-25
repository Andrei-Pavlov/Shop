/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

/**
 *
 * @author pupil
 */
import entity.Product;
import java.util.Scanner;

public class ProductManagers {
    private Scanner scanner;
    
    public ProductManagers() {
        this.scanner = new Scanner(System.in);
    }
        
        public Product createTovar(){
        Product tovar = new Product();
        
        System.out.println("Введите название товара: ");
        tovar.setName(scanner.nextLine());
        System.out.println("Введите бренд: ");
        tovar.setBrand(scanner.nextLine());
        
        System.out.println("Введите цену: ");
        tovar.setPrice(scanner.nextInt());
        System.out.println("Введите кол-во товаров: ");
        tovar.setQuantity(scanner.nextInt());
        
        System.out.println("Введите размер товара: ");
        tovar.setRazner(scanner.nextInt());
        return tovar;
        }
        
          
}


