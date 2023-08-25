package com.example.homework2_11_spring.service;

import com.example.homework2_11_spring.component.Basket;
import com.example.homework2_11_spring.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Map<Integer, Item> products = new HashMap<>();
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
        products.put(1, new Item(1, "Item1", 100));
        products.put(2, new Item(2, "Item2", 130));
        products.put(3, new Item(3, "Item3", 150));
    }

    public List<Item> get() {
        return basket.get();
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(products::get)
                        .collect(Collectors.toList())
        );
     }
}
