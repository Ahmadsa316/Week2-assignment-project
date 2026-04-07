package org.example.week2_assignment;

import org.example.week2_assignment.model.CartItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartLogicTest {

    @Test
    void testSubtotalCalculation() {
        CartItem item = new CartItem(1, 10.0, 3);
        assertEquals(30.0, item.getSubtotal());
    }

    @Test
    void testSecondSubtotalCalculation() {
        CartItem item = new CartItem(2, 5.0, 4);
        assertEquals(20.0, item.getSubtotal());
    }

    @Test
    void testTotalCalculation() {
        CartItem item1 = new CartItem(1, 10.0, 2);
        CartItem item2 = new CartItem(2, 5.0, 3);

        double total = item1.getSubtotal() + item2.getSubtotal();

        assertEquals(35.0, total);
    }
}