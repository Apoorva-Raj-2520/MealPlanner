package com.example.MealPlanner.view;

import com.example.MealPlanner.model.ShoppingListItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingListGUI extends JFrame {

    private JTextField itemNameField;
    private JTextField quantityField;
    private JButton addButton;

    public ShoppingListGUI() {
        setTitle("Shopping List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        itemNameField = new JTextField(20);
        quantityField = new JTextField(5);
        addButton = new JButton("Add Item");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle add item button click event
                String itemName = itemNameField.getText();
                int quantity = Integer.parseInt(quantityField.getText());

                ShoppingListItem item = new ShoppingListItem();
                item.setItemName(itemName);
                item.setQuantity(quantity);

                // Call service to add item to shopping list
            }
        });

        add(new JLabel("Item Name: "));
        add(itemNameField);
        add(new JLabel("Quantity: "));
        add(quantityField);
        add(addButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShoppingListGUI());
    }
}
