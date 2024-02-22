package com.mehmetgenc.homework02.entity;

import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Creation Date: 21.02.2024
 *
 * @author: mehmetgenc
 */
public class CustomerService {
    private List<Customer> customers;

    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public List<Customer> getAllCustomersContainsWith(String word) {
        return customers.stream().filter(customer -> customer.getName().contains(word)).collect(Collectors.toList());
    }

    public Double getTotalInvoiceAmountCustomersRegisteredInMonth(Month monthOfInvoice) {
       return customers.stream()
               .filter(customer -> customer.getRegisteredDate().getMonth().equals(monthOfInvoice))
                .flatMap(customer -> customer.getInvoices().stream())
                .mapToDouble(Invoice::getAmount)
                .sum();
    }

    public List<Invoice> getAllInvoices() {
        return customers.stream()
                .flatMap(customer -> customer.getInvoices().stream())
                .collect(Collectors.toList());
    }
}
