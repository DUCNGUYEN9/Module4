package com.nd.service;

import com.nd.model.Image;
import com.nd.model.Product;

import java.util.List;

public interface ImageService {
    List<Image> displayData(String id, int page, int size, String direction, String sortBy);

    List<Integer> getListPage(String id, int size);

    Image findById(int id);
    boolean delete(int id);
    boolean save(Image image);
    Image findByProduct_ProductId(String productId);
}
