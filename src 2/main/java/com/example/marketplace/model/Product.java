package com.example.marketplace.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int product_id;





    private String product_brand;

    private String certification;

    @OneToMany(mappedBy = "product")
    List<ProjectProduct> projectproduct = new ArrayList<>();

    //set

    @OneToOne
    @JoinColumn(name ="technical_detail_id",referencedColumnName = "technical_detail_id")
    private TechnicalDetail technicaldetail;


    @OneToOne
    @JoinColumn(name ="description_id",referencedColumnName = "description_id")
    private Description description;

    @OneToOne
    @JoinColumn(name ="product_type_id",referencedColumnName = "product_type_id")
    private ProductType producttype;



    public Product() {

    }

    public Product(String product_brand, String certification) {

        this.product_brand = product_brand;
        this.certification = certification;
    }

    public int getProduct_id() {
        return product_id;
    }



    public String getProduct_brand() {
        return product_brand;
    }

    public String getCertification() {
        return certification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +

                ", product_brand='" + product_brand + '\'' +
                ", certification='" + certification + '\'' +
                ", projectList=" + projectproduct +
                '}';
    }

}
