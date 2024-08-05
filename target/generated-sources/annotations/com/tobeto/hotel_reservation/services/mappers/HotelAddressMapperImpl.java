package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.District;
import com.tobeto.hotel_reservation.entities.Hotel;
import com.tobeto.hotel_reservation.entities.HotelAddress;
import com.tobeto.hotel_reservation.services.dtos.requests.AddHotelAddressRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class HotelAddressMapperImpl implements HotelAddressMapper {

    @Override
    public HotelAddress hotelAddressFromAddRequest(AddHotelAddressRequest addHotelAddressRequest) {
        if ( addHotelAddressRequest == null ) {
            return null;
        }

        HotelAddress hotelAddress = new HotelAddress();

        hotelAddress.setHotel( addHotelAddressRequestToHotel( addHotelAddressRequest ) );
        hotelAddress.setDistrict( addHotelAddressRequestToDistrict( addHotelAddressRequest ) );
        hotelAddress.setAddressText( addHotelAddressRequest.getAddressText() );

        return hotelAddress;
    }

    protected Hotel addHotelAddressRequestToHotel(AddHotelAddressRequest addHotelAddressRequest) {
        if ( addHotelAddressRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( addHotelAddressRequest.getHotelId() );

        return hotel;
    }

    protected District addHotelAddressRequestToDistrict(AddHotelAddressRequest addHotelAddressRequest) {
        if ( addHotelAddressRequest == null ) {
            return null;
        }

        District district = new District();

        district.setId( addHotelAddressRequest.getDistrictId() );

        return district;
    }
}
