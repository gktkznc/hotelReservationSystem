package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.User;
import com.tobeto.hotel_reservation.services.dtos.requests.RegisterRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class AuthMapperImpl implements AuthMapper {

    @Override
    public User userFromRegisterRequest(RegisterRequest registerRequest) {
        if ( registerRequest == null ) {
            return null;
        }

        User user = new User();

        user.setName( registerRequest.getName() );
        user.setSurname( registerRequest.getSurname() );
        user.setIdentificationNumber( registerRequest.getIdentificationNumber() );
        user.setPhoneNumber( registerRequest.getPhoneNumber() );
        user.setEmail( registerRequest.getEmail() );
        user.setRole( registerRequest.getRole() );
        user.setGender( registerRequest.getGender() );

        return user;
    }
}
