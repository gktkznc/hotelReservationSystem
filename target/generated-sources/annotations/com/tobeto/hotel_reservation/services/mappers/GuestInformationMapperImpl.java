package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.GuestInformation;
import com.tobeto.hotel_reservation.entities.Reservation;
import com.tobeto.hotel_reservation.services.dtos.requests.AddGuestInformationRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class GuestInformationMapperImpl implements GuestInformationMapper {

    @Override
    public GuestInformation guestInformationFromAddRequest(AddGuestInformationRequest addGuestInformationRequest) {
        if ( addGuestInformationRequest == null ) {
            return null;
        }

        GuestInformation guestInformation = new GuestInformation();

        guestInformation.setReservation( addGuestInformationRequestToReservation( addGuestInformationRequest ) );
        guestInformation.setName( addGuestInformationRequest.getName() );
        guestInformation.setSurname( addGuestInformationRequest.getSurname() );
        guestInformation.setIdentificationNumber( addGuestInformationRequest.getIdentificationNumber() );
        guestInformation.setGender( addGuestInformationRequest.getGender() );

        return guestInformation;
    }

    protected Reservation addGuestInformationRequestToReservation(AddGuestInformationRequest addGuestInformationRequest) {
        if ( addGuestInformationRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( addGuestInformationRequest.getReservationId() );

        return reservation;
    }
}
