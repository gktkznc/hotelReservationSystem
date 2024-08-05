package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Feedback;
import com.tobeto.hotel_reservation.entities.Reservation;
import com.tobeto.hotel_reservation.services.dtos.requests.AddFeedbackRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class FeedbackMapperImpl implements FeedbackMapper {

    @Override
    public Feedback feedbackFromAddRequest(AddFeedbackRequest addFeedbackRequest) {
        if ( addFeedbackRequest == null ) {
            return null;
        }

        Feedback feedback = new Feedback();

        feedback.setReservation( addFeedbackRequestToReservation( addFeedbackRequest ) );
        feedback.setRating( addFeedbackRequest.getRating() );
        feedback.setComment( addFeedbackRequest.getComment() );

        return feedback;
    }

    protected Reservation addFeedbackRequestToReservation(AddFeedbackRequest addFeedbackRequest) {
        if ( addFeedbackRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( addFeedbackRequest.getReservationId() );

        return reservation;
    }
}
