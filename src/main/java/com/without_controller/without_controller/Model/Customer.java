package com.without_controller.without_controller.Model;

import org.springframework.data.annotation.Id;

public class Customer {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    @Id
    Integer id;
    String custName;
    String Product;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custName='" + custName + '\'' +
                ", Product='" + Product + '\'' +
                '}';
    }
}
