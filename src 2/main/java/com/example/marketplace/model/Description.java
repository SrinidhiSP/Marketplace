package com.example.marketplace.model;

import jakarta.persistence.*;


@Entity
public class Description {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int description_id;

    private String manufacturer;

    private String series;


    private String model;

    private String certification;

    @OneToOne()
    @JoinColumn(name="product_id",referencedColumnName = "product_id")
    private Product product;

    public Description() {
    }

    public Description(String manufacturer, String series, String model, String certification, Product product) {
        this.manufacturer = manufacturer;
        this.series = series;
        this.model = model;
        this.certification = certification;
        this.product = product;
    }

    public int getDescription_id() {
        return description_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public String getCertification() {
        return certification;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Description{" +
                "description_id=" + description_id +
                ", manufacturer='" + manufacturer + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", certification='" + certification + '\'' +
                ", product=" + product +
                '}';
    }
}
