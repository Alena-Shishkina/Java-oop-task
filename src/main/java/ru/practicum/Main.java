package ru.practicum;

import ru.practicum.model.Apple;
import ru.practicum.model.Food;
import ru.practicum.model.Meat;
import ru.practicum.model.constants.Colour;
import ru.practicum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
     Food meet = new Meat(5,100);
     Food appleRed = new Apple(10,50, Colour.RED);
     Food appleGreen = new Apple(8,60, Colour.GREEN);

     Food[] products = {meet, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: %.2f рублей. %n", shoppingCart.getTotalNoDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f рублей. %n", shoppingCart.getTotalDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f рублей. %n", shoppingCart.getTotalIsVegetarianNoDiscount());

    }
}
