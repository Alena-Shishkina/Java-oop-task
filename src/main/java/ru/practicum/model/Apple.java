package ru.practicum.model;

import ru.practicum.model.constants.Colour;
import ru.practicum.model.constants.Discount;

public class Apple extends Food{

   private String colour;

public Apple(int amount, double price, String colour){
    super(amount, price, true);
    this.colour = colour;
    }


    @Override
        public double getDiscount() {
            if (colour.equals(Colour.RED)) {
               return Discount.DISCOUNT_RED_APPLE;
            } else {
               return Discount.DISCOUNT_GREEN_APPLE;
            }
        }

}


