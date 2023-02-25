package com.hms.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RoomDAO {
	
	@Autowired
	JdbcTemplate jdbc;

	public Room searchRoom(int roomId) {
		String cmd="select * from room where room_id=?";
		List<Room> roomList=jdbc.query(cmd,new Object[] {roomId},new RowMapper<Room>() {
			@Override
			public Room mapRow(ResultSet rs,int arg1) throws SQLException{
				Room room=new Room();
				room.setRoomId(rs.getInt("ROOM_ID"));
				room.setRoom_type(rs.getString("ROOM_TYPE"));
				room.setPrice(rs.getInt("PRICE"));
				room.setRoom_status(rs.getString("ROOM_STATUS"));
				return room;
			}
		});
		return roomList.get(0);
	}

	public String updateRoom(int roomId,String status) {
		String cmd = "Update Room set ROOM_STATUS=?"
				+ " WHERE ROOM_ID=?";
		jdbc.update(cmd, new Object[] {status,roomId});
		return "Updated room status";
		
	}
	
	

}
