package ru.safronov.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.safronov.webservice.services.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private final ProductsService orderDetailsService;

    @Autowired
    public ProductsController(ProductsService orderDetailsService) {
        this.orderDetailsService = orderDetailsService;
    }
}
