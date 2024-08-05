package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Hotel;
import com.tobeto.hotel_reservation.entities.HotelImage;
import com.tobeto.hotel_reservation.services.dtos.requests.AddHotelImageRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class HotelImageMapperImpl implements HotelImageMapper {

    @Override
    public HotelImage hotelImageFromAddRequest(AddHotelImageRequest addHotelImageRequest) {
        if ( addHotelImageRequest == null ) {
            return null;
        }

        HotelImage hotelImage = new HotelImage();

        hotelImage.setHotel( addHotelImageRequestToHotel( addHotelImageRequest ) );
        hotelImage.setImageUrl( addHotelImageRequest.getImageUrl() );

        return hotelImage;
    }

    protected Hotel addHotelImageRequestToHotel(AddHotelImageRequest addHotelImageRequest) {
        if ( addHotelImageRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( addHotelImageRequest.getHotelId() );

        return hotel;
    }
}
