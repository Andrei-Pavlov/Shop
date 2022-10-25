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
import entity.Customer;
import java.util.Scanner;


public class CustomerManager {
    private Scanner scanner;

    public CustomerManager() {
        this.scanner = new Scanner(System.in);
    }
    public Customer createCustomer(){
    Customer customer = new Customer();
    System.out.println("Имя");
    customer.setFirstname(scanner.nextLine());
    System.out.println("Фамилия");
    customer.setLastname(scanner.nextLine());
    System.out.println("Денег");
    customer.setCash(scanner.nextInt());
    return customer;
    }

}
