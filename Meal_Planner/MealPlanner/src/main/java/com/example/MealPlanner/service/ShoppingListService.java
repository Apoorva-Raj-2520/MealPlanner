package com.example.MealPlanner.service;

import com.example.MealPlanner.repository.ShoppingListItemRepository;
import com.example.MealPlanner.model.ShoppingListItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingListItemRepository shoppingListItemRepository;

    public List<ShoppingListItem> getAllItems() {
        return shoppingListItemRepository.findAll();
    }

    public void addItem(ShoppingListItem item) {
        shoppingListItemRepository.save(item);
    }

    // Implement other business logic methods
}
