package com.nd.repository;

import com.nd.model.Bill;
import com.nd.model.Categories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {
    @Query("select c from Bill c where c.productId like %?1%")
    Page<Bill> findByProductId(String productId, Pageable pageable);
    int countByProductId(String productId);
    List<Bill> findAllBy();
}
