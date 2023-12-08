package com.nd.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id",length = 5)
    private String productId;
    @Column(name = "productName")
    private String productName;
    @Column(name = "price")
    private float price;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "created")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created;
    @Column(name = "image")
    private String image;
    @OneToMany(mappedBy = "product")
    private List<Image> imageList;
    @Column(name = "unit")
    private String unit;
    @Column(name = "status")
    private boolean status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "catalog_id", referencedColumnName = "catalog_id")
    private Categories catalog;

    public Product() {
    }

    public Product(String productId, String productName, float price, String title, String description, Date created, String image, List<Image> imageList, String unit, boolean status, Categories catalog) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.title = title;
        this.description = description;
        this.created = created;
        this.image = image;
        this.imageList = imageList;
        this.unit = unit;
        this.status = status;
        this.catalog = catalog;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {

        this.created = created;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Categories getCatalog() {
        return catalog;
    }

    public void setCatalog(Categories catalog) {
        this.catalog = catalog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
