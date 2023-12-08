package com.nd.service;

import com.nd.model.Bill;
import com.nd.model.Categories;

import java.util.List;

public interface BillService {
    List<Bill> displayData(String billId, int page, int size, String direction, String sortBy);

    List<Integer> getListPage(String billId, int size);

    Bill findById(int id);


    List<Bill> findAll();
}
