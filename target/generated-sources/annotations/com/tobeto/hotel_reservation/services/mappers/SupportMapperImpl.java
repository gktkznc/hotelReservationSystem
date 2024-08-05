package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Support;
import com.tobeto.hotel_reservation.entities.User;
import com.tobeto.hotel_reservation.services.dtos.requests.AddSupportRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class SupportMapperImpl implements SupportMapper {

    @Override
    public Support supportFromAddRequest(AddSupportRequest addSupportRequest) {
        if ( addSupportRequest == null ) {
            return null;
        }

        Support support = new Support();

        support.setUser( addSupportRequestToUser( addSupportRequest ) );
        support.setTitle( addSupportRequest.getTitle() );
        support.setText( addSupportRequest.getText() );

        return support;
    }

    protected User addSupportRequestToUser(AddSupportRequest addSupportRequest) {
        if ( addSupportRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addSupportRequest.getUserId() );

        return user;
    }
}
