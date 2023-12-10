package com.example.esprituniv.services;

import com.example.esprituniv.entities.Reservation;

public interface IReservationService {
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (long idReservation);
}
