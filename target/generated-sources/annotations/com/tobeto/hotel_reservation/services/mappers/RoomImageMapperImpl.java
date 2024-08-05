package com.tobeto.hotel_reservation.services.mappers;

import com.tobeto.hotel_reservation.entities.Room;
import com.tobeto.hotel_reservation.entities.RoomImage;
import com.tobeto.hotel_reservation.services.dtos.requests.AddRoomImageRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-03T18:42:58+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class RoomImageMapperImpl implements RoomImageMapper {

    @Override
    public RoomImage roomImageFromAddRequest(AddRoomImageRequest addRoomImageRequest) {
        if ( addRoomImageRequest == null ) {
            return null;
        }

        RoomImage roomImage = new RoomImage();

        roomImage.setRoom( addRoomImageRequestToRoom( addRoomImageRequest ) );
        roomImage.setImageUrl( addRoomImageRequest.getImageUrl() );

        return roomImage;
    }

    protected Room addRoomImageRequestToRoom(AddRoomImageRequest addRoomImageRequest) {
        if ( addRoomImageRequest == null ) {
            return null;
        }

        Room room = new Room();

        room.setId( addRoomImageRequest.getRoomId() );

        return room;
    }
}
