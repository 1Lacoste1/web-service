package ru.safronov.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.safronov.webservice.models.Product;
import ru.safronov.webservice.repositories.ProductsRepository;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductsService {
    private final ProductsRepository orderDetailsRepository;

    @Autowired
    public ProductsService(ProductsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    public List<Product> findAll() {
        return orderDetailsRepository.findAll();
    }
}
