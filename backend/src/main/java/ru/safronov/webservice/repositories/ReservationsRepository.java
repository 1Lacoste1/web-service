package ru.safronov.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.safronov.webservice.models.Reservation;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservation, Integer> {
}
