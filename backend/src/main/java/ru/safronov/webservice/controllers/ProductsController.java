package ru.safronov.webservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.safronov.webservice.DTO.ProductDTO;
import ru.safronov.webservice.DTO.ProductsResponse;
import ru.safronov.webservice.models.Product;
import ru.safronov.webservice.services.ProductsService;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private final ProductsService productsService;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductsController(ProductsService productsService, ModelMapper modelMapper) {
        this.productsService = productsService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public ProductsResponse show(ProductDTO productDTO) {
        return new ProductsResponse(productsService.findAll().stream().map(this::convertToProductDTO).collect(Collectors.toList()));
    }

    public ProductDTO convertToProductDTO(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }
}
