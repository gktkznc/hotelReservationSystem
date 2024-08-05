package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Hotel;
import com.tobeto.hotel_reservation.entities.Room;
import com.tobeto.hotel_reservation.services.dtos.requests.AddRoomRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class RoomMapperImpl implements RoomMapper {

    @Override
    public Room roomFromAddRequest(AddRoomRequest addRoomRequest) {
        if ( addRoomRequest == null ) {
            return null;
        }

        Room room = new Room();

        room.setHotel( addRoomRequestToHotel( addRoomRequest ) );
        room.setRoomType( addRoomRequest.getRoomType() );
        room.setCapacity( addRoomRequest.getCapacity() );
        room.setPrice( addRoomRequest.getPrice() );
        room.setRoomStatus( addRoomRequest.getRoomStatus() );

        return room;
    }

    protected Hotel addRoomRequestToHotel(AddRoomRequest addRoomRequest) {
        if ( addRoomRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( addRoomRequest.getHotelId() );

        return hotel;
    }
}
