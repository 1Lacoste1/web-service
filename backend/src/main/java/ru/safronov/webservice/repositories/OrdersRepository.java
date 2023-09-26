package ru.safronov.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.safronov.webservice.models.Order;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
}
