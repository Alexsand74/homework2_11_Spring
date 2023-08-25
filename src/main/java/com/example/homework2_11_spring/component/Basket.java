package com.example.homework2_11_spring.component;

import com.example.homework2_11_spring.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Item> items = new ArrayList<>();

    public List<Item> get() {
        return Collections.unmodifiableList(items);
    }

    public void add(List<Item> items) {
        this.items.addAll(items);
    }
}
