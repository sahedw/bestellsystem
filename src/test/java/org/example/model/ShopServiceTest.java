package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void test_addToOrder(){
        ShopService shop = new ShopService();
        int expected = shop.getListOfProducts().size() + 1;
        shop.addToOrder("1");
        Assertions.assertEquals(expected, shop.getListOfProducts().size());
    }

}