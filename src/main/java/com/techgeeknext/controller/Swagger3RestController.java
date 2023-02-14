package com.techgeeknext.controller;

import com.techgeeknext.model.Room;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class Swagger3RestController {

	List<Room> rooms = new ArrayList<Room>();
	{
		rooms.add(new Room(1,"Deluxe Room", "Air Conditioner, Free Wi-fi, TV, BathRoom", 500, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "11-Nov-2021", "12-Nov-2021", 4.5));
		rooms.add(new Room(2,"Deluxe Room", "Air Conditioner, Free Wi-fi, TV, BathRoom", 800, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "15-Nov-2021", "18-Nov-2021", 4D));
		rooms.add(new Room(3,"Private Room", "Air Conditioner, TV, BathRoom", 1500, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "08-Dec-2021", "12-Dec-2021", 5D));
		rooms.add(new Room(4,"Economy Room", "TV, BathRoom", 100, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "25-Apr-2021", "30-Apr-2021", 3D));
		rooms.add(new Room(4,"Economy Room", "TV, BathRoom", 100, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "25-Apr-2021", "30-Apr-2021", 3D));
		rooms.add(new Room(4,"Economy Room", "TV, BathRoom", 100, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "25-Apr-2021", "30-Apr-2021", 3D));
		rooms.add(new Room(4,"Economy Room", "TV, BathRoom", 100, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "25-Apr-2021", "30-Apr-2021", 3D));
		rooms.add(new Room(4,"Economy Room", "TV, BathRoom", 100, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhotelalpilivigno.com%2Fcamere&psig=AOvVaw0WgrV0lY0HWQfSw2Y_dFsk&ust=1675335162123000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCGyPuT9PwCFQAAAAAdAAAAABAE", "25-Apr-2021", "30-Apr-2021", 3D));

	}


	@RequestMapping(value = "/getRooms", method = RequestMethod.GET, produces = "application/json")
	public List<Room> getRooms() {
		return rooms;
	}

	@RequestMapping(value = "/getRoom/{id}", method = RequestMethod.GET, produces = "application/json")
	public Room getRoomById(@PathVariable(value = "id") int roomNumber) {
		return rooms.stream().filter(x -> x.getRoomNumber()==(roomNumber)).collect(Collectors.toList()).get(0);
	}

	@RequestMapping(value = "/getRoom/type/{type}", method = RequestMethod.GET, produces = "application/json")
	public List<Room> getRoomByType(@PathVariable(value = "type") String type) {
		return rooms.stream().filter(x -> x.getRoomType().equalsIgnoreCase(type))
				.collect(Collectors.toList());
	}
	
	@PostMapping("/room")  
	private List<Room> saveRoom(@RequestBody Room room)   
	{  
		if (!rooms.contains(room)) {
			rooms.add(room);
			
		}
			
		return rooms;  
	}  
	
	@PutMapping("/room")
	public List<Room> updateRoom(@RequestBody Room newRoom) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == newRoom.getRoomNumber()) {
				room.setRoomType(newRoom.getRoomType());
				room.setAmenities(newRoom.getAmenities());
				room.setPrice(newRoom.getPrice());
				room.setCheckinTime(newRoom.getCheckinTime());
				room.setCheckoutTime(newRoom.getCheckoutTime());
				room.setRating(newRoom.getRating());
			}
		}
		return rooms;
	}
	
	@DeleteMapping("/room/{roomNumber}")
	public List<Room> deleteRoom(@PathVariable("roomNumber") int roomNumber) {
		int indice = 0;
		for (Room room : rooms) {
			
			if (room.getRoomNumber() == roomNumber) {
				//rooms.remove(room);
				indice = rooms.indexOf(room);
			}
		}
		rooms.remove(indice);
		return rooms;
	}
	

}
