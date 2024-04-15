package com.example.MealPlanner;

import javax.swing.SwingUtilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.MealPlanner.view.ShoppingListGUI;

@SpringBootApplication
public class MealPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealPlannerApplication.class, args);
		SwingUtilities.invokeLater(() -> {
            // Create an instance of your Swing GUI class
            ShoppingListGUI shoppingListGUI = new ShoppingListGUI();

            // Make the GUI visible
            shoppingListGUI.setVisible(true);
        });
	}

}
