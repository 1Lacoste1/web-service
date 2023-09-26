package ru.safronov.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.safronov.webservice.models.Order;
import ru.safronov.webservice.repositories.OrdersRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class OrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Order> findAll() {
        return ordersRepository.findAll();
    }


}
