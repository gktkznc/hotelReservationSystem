package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Hotel;
import com.tobeto.hotel_reservation.entities.Room;
import com.tobeto.hotel_reservation.entities.User;
import com.tobeto.hotel_reservation.services.dtos.requests.AddHotelRequest;
import com.tobeto.hotel_reservation.services.dtos.responses.ListHotelResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel hotelFromAddRequest(AddHotelRequest addHotelRequest) {
        if ( addHotelRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setUser( addHotelRequestToUser( addHotelRequest ) );
        hotel.setName( addHotelRequest.getName() );
        hotel.setPhoneNumber( addHotelRequest.getPhoneNumber() );
        hotel.setHotelStar( addHotelRequest.getHotelStar() );
        hotel.setDescription( addHotelRequest.getDescription() );

        return hotel;
    }

    @Override
    public ListHotelResponse listResponseFromHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        ListHotelResponse listHotelResponse = new ListHotelResponse();

        listHotelResponse.setUserId( hotelUserId( hotel ) );
        listHotelResponse.setHotelAddress( hotel.getHotelAddress() );
        List<Room> list = hotel.getRooms();
        if ( list != null ) {
            listHotelResponse.setRooms( new ArrayList<Room>( list ) );
        }
        listHotelResponse.setId( hotel.getId() );
        listHotelResponse.setName( hotel.getName() );
        listHotelResponse.setPhoneNumber( hotel.getPhoneNumber() );
        listHotelResponse.setHotelStar( hotel.getHotelStar() );
        listHotelResponse.setDescription( hotel.getDescription() );

        return listHotelResponse;
    }

    protected User addHotelRequestToUser(AddHotelRequest addHotelRequest) {
        if ( addHotelRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addHotelRequest.getUserId() );

        return user;
    }

    private int hotelUserId(Hotel hotel) {
        User user = hotel.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }
}
