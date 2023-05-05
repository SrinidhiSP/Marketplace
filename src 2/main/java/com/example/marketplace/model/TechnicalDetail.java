package com.example.marketplace.model;

import jakarta.persistence.*;

@Entity
public class TechnicalDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int technical_detail_id;

    private int airflow;
    private int power;
    private int operating_voltage;
    private int fan_speed;

    @OneToOne(mappedBy = "technicaldetail")
    @JoinColumn(name="product_id",referencedColumnName = "product_id")
    private Product product;



    public TechnicalDetail() {
    }

    public TechnicalDetail(int airflow, int power, int operating_voltage, int fan_speed, Product product) {
        this.airflow = airflow;
        this.power = power;
        this.operating_voltage = operating_voltage;
        this.fan_speed = fan_speed;
        this.product = product;
    }

    public int getTechinal_detail_id() {
        return technical_detail_id;
    }

    public int getAirflow() {
        return airflow;
    }

    public int getPower() {
        return power;
    }

    public int getOperating_voltage() {
        return operating_voltage;
    }

    public int getFan_speed() {
        return fan_speed;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "TechnicalDetail{" +
                "techinal_detail_id=" + technical_detail_id +
                ", airflow=" + airflow +
                ", power=" + power +
                ", operating_voltage=" + operating_voltage +
                ", fan_speed=" + fan_speed +
                ", product=" + product +
                '}';
    }
}
