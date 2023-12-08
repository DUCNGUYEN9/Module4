package com.nd.service;

import com.nd.model.Categories;
import com.nd.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> displayData(String orderId, int page, int size, String direction, String sortBy);

    List<Integer> getListPage(String orderId, int size);

    Order findById(String id);


    List<Order> findAll();
    float getRevenueDay();
    float getRevenueMonth();
    float getRevenueYear();
}
