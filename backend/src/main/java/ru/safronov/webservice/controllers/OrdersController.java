package ru.safronov.webservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.safronov.webservice.DTO.OrderDTO;
import ru.safronov.webservice.DTO.OrdersResponse;
import ru.safronov.webservice.models.Order;
import ru.safronov.webservice.services.OrdersService;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrdersService ordersService;
    private final ModelMapper modelMapper;

    @Autowired
    public OrdersController(OrdersService ordersService, ModelMapper modelMapper) {
        this.ordersService = ordersService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public OrdersResponse show(OrderDTO orderDTO) {
        return new OrdersResponse(ordersService.findAll().stream().map(this::convertToOrderDTO).collect(Collectors.toList()));
    }

    public OrderDTO convertToOrderDTO(Order order) {
        return modelMapper.map(order, OrderDTO.class);
    }
}
