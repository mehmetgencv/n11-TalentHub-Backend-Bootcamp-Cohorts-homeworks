package com.mehmetgenc.homework02.entity;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.OptionalDouble;
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

    public List<Invoice> getInvoicesAboveAmount(Double amount) {
        return getAllInvoices()
                .stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .collect(Collectors.toList());
    }
    public OptionalDouble getAverageAboveAmount(Double amount) {
        return getAllInvoices()
                .stream()
                .filter(invoice -> invoice.getAmount() > amount)
                .mapToDouble(Invoice::getAmount)
                .average();
    }

    public List<String> getCustomersWithInvoicesBelowAmount(Double amount){
        return customers.stream()
                .filter(customer -> customer.getInvoices().stream()
                        .mapToDouble(Invoice::getAmount)
                        .anyMatch(invoiceAmount -> invoiceAmount < amount))
                .map(Customer::getName)
                .collect(Collectors.toList());
    }

    public List<String> getCustomersWithAverageInvoiceAmountBelowAmountInMonth(Double amount, Month monthOfInvoice){
        return customers.stream()
                .filter(customer -> customer.getInvoices().stream()
                        .filter(invoice -> invoice.getDate().getMonth() == monthOfInvoice)
                        .mapToDouble(Invoice::getAmount)
                        .average()
                        .orElse(0.0) < amount)
                .map(Customer::getSector)
                .collect(Collectors.toList());

    }

}
