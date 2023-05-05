package com.example.marketplace.model;

import jakarta.persistence.*;

@Entity
public class ProjectProduct {
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  int project_product;

    // name
   @ManyToOne
   @JoinColumn(name="project_id")
    private Project project;

   @ManyToOne
   @JoinColumn(name="product_id")
   private Product product;


    public ProjectProduct() {
    }

    public ProjectProduct(int project_product, Project project, Product product) {
        this.project_product = project_product;
        this.project = project;
        this.product = product;
    }

    public int getProject_product() {
        return project_product;
    }

    public Project getProject() {
        return project;
    }

    public Product getProduct() {
        return product;
    }
}
