package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Feedback;
import com.tobeto.hotel_reservation.entities.ResponseToFeedback;
import com.tobeto.hotel_reservation.services.dtos.requests.AddResponseToFeedbackRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ResponseToFeedbackMapperImpl implements ResponseToFeedbackMapper {

    @Override
    public ResponseToFeedback responseToFeedbackFromAddRequest(AddResponseToFeedbackRequest addResponseToFeedbackRequest) {
        if ( addResponseToFeedbackRequest == null ) {
            return null;
        }

        ResponseToFeedback responseToFeedback = new ResponseToFeedback();

        responseToFeedback.setFeedback( addResponseToFeedbackRequestToFeedback( addResponseToFeedbackRequest ) );
        responseToFeedback.setDescription( addResponseToFeedbackRequest.getDescription() );

        return responseToFeedback;
    }

    protected Feedback addResponseToFeedbackRequestToFeedback(AddResponseToFeedbackRequest addResponseToFeedbackRequest) {
        if ( addResponseToFeedbackRequest == null ) {
            return null;
        }

        Feedback feedback = new Feedback();

        feedback.setId( addResponseToFeedbackRequest.getFeedbackId() );

        return feedback;
    }
}
