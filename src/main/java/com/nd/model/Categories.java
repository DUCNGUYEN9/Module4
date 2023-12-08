package com.nd.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @Column(name = "catalog_id",length = 5)
    private String catalogId;
    @Column(name = "catalog_name")
    private String catalogName;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private boolean status;
    @OneToMany(mappedBy = "catalog",fetch = FetchType.EAGER)
    private List<Product> listProduct;

    public Categories() {
    }

    public Categories(String catalogId, String catalogName, String description, boolean status, List<Product> listProduct) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.description = description;
        this.status = status;
        this.listProduct = listProduct;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
