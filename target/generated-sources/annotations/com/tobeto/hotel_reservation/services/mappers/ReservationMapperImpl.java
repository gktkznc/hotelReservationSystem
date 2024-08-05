package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Hotel;
import com.tobeto.hotel_reservation.entities.Reservation;
import com.tobeto.hotel_reservation.entities.Room;
import com.tobeto.hotel_reservation.entities.User;
import com.tobeto.hotel_reservation.services.dtos.requests.AddReservationRequest;
import com.tobeto.hotel_reservation.services.dtos.responses.AddReservationResponse;
import com.tobeto.hotel_reservation.services.dtos.responses.ListReservationResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation reservationFromAddRequest(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setUser( addReservationRequestToUser( addReservationRequest ) );
        reservation.setRoom( addReservationRequestToRoom( addReservationRequest ) );
        reservation.setEnteranceDay( addReservationRequest.getEnteranceDay() );
        reservation.setReleaseDay( addReservationRequest.getReleaseDay() );

        return reservation;
    }

    @Override
    public AddReservationResponse addResponseFromReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        AddReservationResponse addReservationResponse = new AddReservationResponse();

        addReservationResponse.setId( reservation.getId() );

        return addReservationResponse;
    }

    @Override
    public ListReservationResponse listResponseFromReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ListReservationResponse listReservationResponse = new ListReservationResponse();

        listReservationResponse.setRoom( reservation.getRoom() );
        listReservationResponse.setHotel( reservationRoomHotel( reservation ) );
        listReservationResponse.setPayment( reservation.getPayment() );
        listReservationResponse.setId( reservation.getId() );
        listReservationResponse.setEnteranceDay( reservation.getEnteranceDay() );
        listReservationResponse.setReleaseDay( reservation.getReleaseDay() );
        listReservationResponse.setTotalAmount( reservation.getTotalAmount() );

        return listReservationResponse;
    }

    protected User addReservationRequestToUser(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addReservationRequest.getUserId() );

        return user;
    }

    protected Room addReservationRequestToRoom(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        Room room = new Room();

        room.setId( addReservationRequest.getRoomId() );

        return room;
    }

    private Hotel reservationRoomHotel(Reservation reservation) {
        Room room = reservation.getRoom();
        if ( room == null ) {
            return null;
        }
        return room.getHotel();
    }
}
