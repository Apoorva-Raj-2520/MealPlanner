package com.example.MealPlanner.repository;

import com.example.MealPlanner.model.ShoppingListItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListItemRepository extends JpaRepository<ShoppingListItem, Long> {
    // Define custom query methods if needed
}

