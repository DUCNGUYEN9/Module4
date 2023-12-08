package com.nd.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orderProduct")
public class Order {
    @Id
    @Column(name = "order_id",length = 5)
    private String orderId;
    @Column(name = "account_id")
    private int accountId;
    @Column(name = "created")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created;
    @Column(name = "status")
    private String status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bill_id", referencedColumnName = "bill_id")
    private Bill bill;

    public Order() {
    }


    public Order(String orderId, int accountId, Date created, String status, Bill bill) {
        this.orderId = orderId;
        this.accountId = accountId;
        this.created = created;
        this.status = status;
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
