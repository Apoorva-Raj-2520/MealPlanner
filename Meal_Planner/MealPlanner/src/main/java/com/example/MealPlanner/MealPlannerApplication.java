package com.example.MealPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MealPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealPlannerApplication.class, args);
		SwingUtilities.invokeLater(() -> {
            // Create an instance of your Swing GUI class
            MealPlannerGUI mealPlannerGUI = new MealPlannerGUI();

            // Make the GUI visible
            mealPlannerGUI.setVisible(true);
        });
	}

}
