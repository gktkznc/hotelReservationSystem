package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.District;
import com.tobeto.hotel_reservation.entities.User;
import com.tobeto.hotel_reservation.entities.UserAddress;
import com.tobeto.hotel_reservation.services.dtos.requests.AddUserAddressRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:59+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class UserAddressMapperImpl implements UserAddressMapper {

    @Override
    public UserAddress userAddressFromAddRequest(AddUserAddressRequest addUserAddressRequest) {
        if ( addUserAddressRequest == null ) {
            return null;
        }

        UserAddress userAddress = new UserAddress();

        userAddress.setUser( addUserAddressRequestToUser( addUserAddressRequest ) );
        userAddress.setDistrict( addUserAddressRequestToDistrict( addUserAddressRequest ) );
        userAddress.setAddressText( addUserAddressRequest.getAddressText() );

        return userAddress;
    }

    protected User addUserAddressRequestToUser(AddUserAddressRequest addUserAddressRequest) {
        if ( addUserAddressRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addUserAddressRequest.getUserId() );

        return user;
    }

    protected District addUserAddressRequestToDistrict(AddUserAddressRequest addUserAddressRequest) {
        if ( addUserAddressRequest == null ) {
            return null;
        }

        District district = new District();

        district.setId( addUserAddressRequest.getDistrictId() );

        return district;
    }
}
