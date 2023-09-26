package ru.safronov.webservice.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "serial")
    private String serial;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @ManyToOne()
    @JoinColumn(name = "orders_id", referencedColumnName = "ID")
    private Order orders_id;

    public Product() {}

    public Product(int ID, String serial, String name, int quantity, Order orders_id) {
        this.ID = ID;
        this.serial = serial;
        this.name = name;
        this.quantity = quantity;
        this.orders_id = orders_id;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(Order orders_id) {
        this.orders_id = orders_id;
    }
}
