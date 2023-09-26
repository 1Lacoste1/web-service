package ru.safronov.webservice.DTO;

import java.util.List;

public class OrdersResponse {
    private List<OrderDTO> orders;

    public OrdersResponse(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }
}
