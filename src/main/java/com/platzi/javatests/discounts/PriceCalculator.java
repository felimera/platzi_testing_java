package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private List<Double> pricesList = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        return pricesList.stream().mapToDouble(Double::doubleValue).sum() * ((100 - discount) / 100);
    }

    public void addPrice(double price) {
        pricesList.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
