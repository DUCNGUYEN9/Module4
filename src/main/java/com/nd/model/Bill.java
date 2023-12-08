package com.nd.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @Column(name = "bill_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "price")
    private float price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "total")
    private float total;
    @OneToMany(mappedBy = "bill")
    private List<Order> orderList;

    public Bill() {
    }

    public Bill(int billId, String orderId, String productId, float price, int quantity, float total, List<Order> orderList) {
        this.billId = billId;
        this.orderId = orderId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = getPrice()*getQuantity();
    }
}
