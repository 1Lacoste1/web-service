package ru.safronov.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.safronov.webservice.models.Reservation;

import java.util.List;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservation, Integer> {
    @Transactional
    @Query("SELECT r FROM Reservation r JOIN FETCH r.products")
    List<Reservation> findAllWithProduct();
}
