package org.example.week2_assignment;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.week2_assignment.model.CartItem;

import java.util.Locale;
import java.util.ResourceBundle;

public class ShoppingCartController {

    @FXML private Label titleLabel;
    @FXML private ComboBox<String> languageBox;
    @FXML private TextField item1PriceField;
    @FXML private TextField item1QuantityField;
    @FXML private TextField item2PriceField;
    @FXML private TextField item2QuantityField;
    @FXML private Button calculateButton;
    @FXML private Label resultLabel;

    private ResourceBundle bundle;

    @FXML
    public void initialize() {
        languageBox.getItems().addAll("en", "fi", "sv", "ja", "ar");
        languageBox.setValue("en");

        loadLanguage("en");

        languageBox.setOnAction(e -> {
            loadLanguage(languageBox.getValue());
        });
    }

    private void loadLanguage(String lang) {

        Locale locale;

        switch (lang) {
            case "fi": locale = new Locale("fi", "FI"); break;
            case "sv": locale = new Locale("sv", "SE"); break;
            case "ja": locale = new Locale("ja", "JP"); break;
            case "ar": locale = new Locale("ar", "AR"); break;
            default: locale = new Locale("en", "US");
        }

        bundle = ResourceBundle.getBundle(
                "org.example.week2_assignment.MessagesBundle",
                locale
        );

        titleLabel.setText(bundle.getString("title"));
        calculateButton.setText(bundle.getString("calculate"));

        item1PriceField.setPromptText(bundle.getString("item1price"));
        item1QuantityField.setPromptText(bundle.getString("item1quantity"));

        item2PriceField.setPromptText(bundle.getString("item2price"));
        item2QuantityField.setPromptText(bundle.getString("item2quantity"));

        resultLabel.setText(bundle.getString("total") + ":");
    }

    @FXML
    private void handleCalculate() {
        try {
            double p1 = Double.parseDouble(item1PriceField.getText());
            int q1 = Integer.parseInt(item1QuantityField.getText());

            double p2 = Double.parseDouble(item2PriceField.getText());
            int q2 = Integer.parseInt(item2QuantityField.getText());

            CartItem item1 = new CartItem(1, p1, q1);
            CartItem item2 = new CartItem(2, p2, q2);

            double total = item1.getSubtotal() + item2.getSubtotal();

            resultLabel.setText(bundle.getString("total") + ": " + total);

        } catch (Exception e) {
            resultLabel.setText(bundle.getString("invalid"));
        }
    }
}