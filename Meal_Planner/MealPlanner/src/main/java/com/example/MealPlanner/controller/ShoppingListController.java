package com.example.MealPlanner.controller;

import com.example.MealPlanner.model.ShoppingListItem;
import com.example.MealPlanner.service.ShoppingListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-list")
public class ShoppingListController {

    @Autowired
    private ShoppingListService shoppingListService;

    @GetMapping("/items")
    public List<ShoppingListItem> getAllItems() {
        return shoppingListService.getAllItems();
    }

    @PostMapping("/items")
    public void addItem(@RequestBody ShoppingListItem item) {
        shoppingListService.addItem(item);
    }

    // Implement other endpoints as needed
}
