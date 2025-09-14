package ru.practicum.service;

import ru.practicum.model.Food;

public class ShoppingCart {

    private final Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalNoDiscount() {
        double total = 0;

        for (Food items : products) {
            total += items.getAmount() * items.getPrice();
        }
        return total;
    }

    public double getTotalDiscount() {
        double total = 0;

        for (Food items : products) {
            total += items.getAmount() * items.getPrice() * (1 - items.getDiscount() / 100);
        }
        return total;

    }

    public double getTotalIsVegetarianNoDiscount() {
        double total = 0;


        for (Food items : products) {
            if (items.isVegetarian()) {
                total += items.getAmount() * items.getPrice();
            }
        }
            return total;
        }
}
