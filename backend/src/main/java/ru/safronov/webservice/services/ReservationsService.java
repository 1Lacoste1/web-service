package ru.safronov.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.safronov.webservice.models.Reservation;
import ru.safronov.webservice.repositories.ReservationsRepository;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ReservationsService {
    private final ReservationsRepository ordersRepository;

    @Autowired
    public ReservationsService(ReservationsRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Reservation> findAll() {
        return ordersRepository.findAll();
    }
}
