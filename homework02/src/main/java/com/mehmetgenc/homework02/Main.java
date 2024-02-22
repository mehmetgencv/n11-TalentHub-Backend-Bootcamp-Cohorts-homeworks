package com.mehmetgenc.homework02;

import com.mehmetgenc.homework02.entity.Customer;
import com.mehmetgenc.homework02.entity.CustomerService;
import com.mehmetgenc.homework02.entity.Invoice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Creation Date: 20.02.2024
 *
 * @author: mehmetgenc
 */
public class Main {
    public static void main(String[] args) {


        Customer customer1 = new Customer(1, "Mehmet", "Accessories", LocalDate.of(2023, Month.JUNE, 15));
        customer1.addInvoice(new Invoice(LocalDate.of(2023, Month.JANUARY, 15), 1000));
        customer1.addInvoice(new Invoice(LocalDate.of(2024, 6, 15), 2000));



        Customer customer2 = new Customer(2, "Hakan", "Accessories", LocalDate.of(2024, 6, 20));
        customer2.addInvoice(new Invoice(LocalDate.of(2024, 6, 20), 3000));
        customer2.addInvoice(new Invoice(LocalDate.of(2024, 6, 25), 4000));

        Customer customer3 = new Customer(3,"Mert C", "Retail", LocalDate.of(2021, 6, 20));
        customer3.addInvoice(new Invoice(LocalDate.of(2024, 7, 5), 100));
        customer3.addInvoice(new Invoice(LocalDate.of(2024, 7, 10), 100));

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        CustomerService customerManager = new CustomerService(customers);


        // 1 - List all customers
        System.out.println("All Customers:");
        customerManager.getAllCustomers().forEach(customer -> System.out.println(customer.getName()));

        // 2 - Listing customers whose names contain 'C'
        System.out.println("\nCustomers Whose Names Contain 'C':");
        customerManager.getAllCustomersContainsWith("C").forEach(customer -> System.out.println(customer.getName()));

        // 3 - Total invoice amount for customers registered in June
        System.out.println("\nTotal Invoice Amount for Customers Registered in June:");
        System.out.println(customerManager.getTotalInvoiceAmountCustomersRegisteredInMonth(Month.JUNE));

        // 4 - Listing all invoices in the system
        System.out.println("\nAll Invoices:");
        customerManager.getAllInvoices().forEach(System.out::println);

        // 5 - Listing invoices above 1500TL
        System.out.println("\nInvoices Above 1500TL:");
        customerManager.getInvoicesAboveAmount(1500.0).forEach(System.out::println);

        // Average of invoices above 1500TL
        System.out.println("\nAverage of Invoices Above 1500TL:");
        System.out.println(customerManager.getAverageAboveAmount(1500.0).getAsDouble());

        // Listing names of customers with invoices below 500TL
        System.out.println("\nNames of Customers with Invoices Below 500TL:");
        customerManager.getCustomersWithInvoicesBelowAmount(500.0).forEach(System.out::println);

        // Listing sectors of companies with average invoice amount below 750 in June
        System.out.println("\nSectors of Companies with Average Invoice Amount Below 750 in June:");
        customerManager.getCustomersWithAverageInvoiceAmountBelowAmountInMonth(750.0, Month.JUNE).forEach(System.out::println);

    }
}