package com.nd.model;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;
    @Column(name = "path")
    private String path;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product;

    public Image() {
    }

    public Image(int imageId, String path, Product product) {
        this.imageId = imageId;
        this.path = path;
        this.product = product;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
