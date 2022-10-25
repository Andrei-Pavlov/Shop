/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author pupil
 */
import entity.Product;
import entity.Customer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import managers.ProductManagers;
import managers.CustomerManager;


public class app {
    private Product[] tovars;
    private Customer[] customer;
    int history[];
    
    public app() {

        this.tovars = new Product[0];
        this.customer = new Customer[0];
        this.history = new int[0];
    }
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        
        do{ 
            System.out.println("Выберите задачу из списка: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить товар");
            System.out.println("2. Добавить покупателя");
            System.out.println("3. Товары");
            System.out.println("4. Покупатели");
            System.out.println("5. Покупка");
            System.out.println("6. Доход магазина");
            System.out.println("7. Добавление денег покупателю");
            
            
            int task = scanner.nextInt();
            
            switch(task){
                case 0:
                    System.out.println("Пока!");
                    break;
                case 1:
                    System.out.println("Введите данные товара");
                    ProductManagers tovarManegers = new ProductManagers();
                    
                    this.tovars = Arrays.copyOf(this.tovars, this.tovars.length+1);
                    this.tovars[this.tovars.length-1] = tovarManegers.createTovar();
                    
                    break;
                case 2:
                    System.out.println("Добавление покупателя");
                    CustomerManager customerManager = new CustomerManager();
                    
                    this.customer = Arrays.copyOf(this.customer, this.customer.length+1);
                    this.customer[this.customer.length-1] = customerManager.createCustomer();
                    break;
                case 3:
                    System.out.println("Товары");
                    for (int i = 0; i<tovars.length;i++){
                        Product tovarss = tovars[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Tovars{title    = %s%n", tovarss.getName());
                        System.out.printf("Tovars{brand    = %s%n", tovarss.getBrand());
                        System.out.printf("Tovars{price    = %s%n", tovarss.getPrice());
                        System.out.printf("Tovars{quantity = %s%n", tovarss.getQuantity());
                        System.out.printf("Tovars{razmer   = %s%n", tovarss.getRazner());
                        System.out.println("\t]");
                    }
                    break;
                case 4:
                    System.out.println("Покупатели");
                    for (int i = 0; i<customer.length;i++){
                        Customer customers = customer[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", customers.getFirstname());
                        System.out.printf("Customer{Lastname  = %s%n", customers.getLastname());
                        System.out.printf("Customer{Cash      = %s%n", customers.getCash());
                        System.out.println("\t]");
                    }
                        
                    
                    break;
                case 5:
                    System.out.println("Покупка");
                    System.out.println("Customer List");
                    for (int i = 0; i<customer.length;i++){
                        Customer customers = customer[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", customers.getFirstname());
                        System.out.printf("        {Lastname  = %s%n", customers.getLastname());
                        System.out.printf("        {Cash      = %s%n", customers.getCash());
                        System.out.println("\t]");
                    }
                    System.out.println("Товары");
                        for (int j = 0; j<tovars.length;j++){
                        Product tovarss = tovars[j];
                        System.out.println("\t[");
                        System.out.printf(j+1+".Tovars{title    = %s%n", tovarss.getName());
                        System.out.printf("      {brand    = %s%n", tovarss.getBrand());
                        System.out.printf("      {price    = %s%n", tovarss.getPrice());
                        System.out.printf("      {quantity = %s%n", tovarss.getQuantity());     
                        System.out.printf("      {razmer   = %s%n", tovarss.getRazner());
                        System.out.println("\t]");
                    }
                    System.out.println("Выберите покупателя");
                    int pur = scanner.nextInt();
                    System.out.println("Выберите товар");
                    int pur1 = scanner.nextInt();
                    int newpur = customer[pur-1].getCash() - tovars[pur1-1].getPrice();
                    customer[pur-1].setCash(newpur);
                    int newpurl = tovars[pur1-1].getQuantity() - 1;
                    tovars[pur1-1].setQuantity(newpurl);
                    

                    this.history = Arrays.copyOf(this.history, this.history.length+1);
                    this.history[this.history.length-1] = tovars[pur1-1].getPrice();
                    
                    break;
                case 6:
                    System.out.println("Доход магазина");
                    int sum = IntStream.of(history).sum();
                    System.out.println("Доход=" + sum);
                   
                    break;
                case 7:
                    for (int i = 0; i<customer.length;i++){
                        Customer customers = customer[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", customers.getFirstname());
                        System.out.printf("        {Lastname  = %s%n", customers.getLastname());
                        System.out.printf("        {Cash      = %s%n", customers.getCash());
                        System.out.println("\t]");
                    }
                    System.out.println("Выберите покупателя");
                    int num = scanner.nextInt();
                    System.out.println("Ведите кол-во денег для добавления");
                    int num2 = scanner.nextInt();
                    int newcash = customer[num-1].getCash() + num2;
                    customer[num-1].setCash(newcash);
                    break;
                    
                default:
                    System.out.println("Выберите задачу из списка: ");
                
            }
            System.out.println("======================================");
        }while(repeat);
    }
}
