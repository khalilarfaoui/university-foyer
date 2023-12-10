package com.example.esprituniv.controller;

import com.example.esprituniv.entities.Reservation;
import com.example.esprituniv.services.IReservationService;
import com.example.esprituniv.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;

    @PutMapping("/updateReservation")
    public Reservation updateReservation(Reservation res){
        Reservation reservation =  reservationService.updateReservation(res);
        return  reservation;
    }

    @GetMapping("/retrieveReservation")
    public Reservation retrieveReservation(long idReservation){
        Reservation reservation = reservationService.retrieveReservation(idReservation);
        return reservation;
    }


}
