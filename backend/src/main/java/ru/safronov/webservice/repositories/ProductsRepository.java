package ru.safronov.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.safronov.webservice.models.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
