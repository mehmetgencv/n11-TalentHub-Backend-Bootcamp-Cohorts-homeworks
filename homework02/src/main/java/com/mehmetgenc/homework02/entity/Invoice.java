package com.mehmetgenc.homework02.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Creation Date: 20.02.2024
 *
 * @author: mehmetgenc
 */
public class Invoice {
    private double amount;
    private LocalDate date;
    public Invoice(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }
}
