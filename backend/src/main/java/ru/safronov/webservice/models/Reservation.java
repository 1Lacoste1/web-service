package ru.safronov.webservice.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "amount")
    private int amount;

    @Column(name = "date_creation")
    private Date date_creation;

    @JsonManagedReference
    @OneToMany(mappedBy = "orders_id")
    private List<Product> products;

    public Reservation() {}

    public Reservation(int ID, String name, String address, int amount, Date date_creation, List<Product> products) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.amount = amount;
        this.date_creation = date_creation;
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
}
