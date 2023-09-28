package ru.safronov.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.safronov.webservice.models.Reservation;
import ru.safronov.webservice.services.ReservationsService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class ReservationsController {
    private final ReservationsService ordersService;

    @Autowired
    public ReservationsController(ReservationsService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping()
    public List<Reservation> show() {
        return ordersService.findAll();
    }
}