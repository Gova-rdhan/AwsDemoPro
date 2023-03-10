package com.hms.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {

	@Autowired  
    JdbcTemplate jdbc;  
	
	public Orders searchByOrderId(int ordId) {
		String cmd = "select * from Orders where ord_id=?";
		List<Orders> ordersList=null;
		ordersList=jdbc.query(cmd,new Object[] {ordId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrdId(rs.getInt("ORD_ID"));
				orders.setEmailId(rs.getString("EMAIL_ID"));
				orders.setVenId(rs.getInt("VEN_ID"));
				orders.setWalSource(rs.getString("WAL_SOURCE"));
				orders.setMenuId(rs.getInt("MENU_ID"));
				orders.setOrdDate(rs.getDate("ORD_DATE"));
				orders.setOrdBillamount(rs.getDouble("ORD_BILLAMOUNT"));
				orders.setOrdStatus(rs.getString("ORD_STATUS"));
				orders.setOrdComments(rs.getString("ORD_COMMENTS"));
				return orders;
			}
			
		});
		return ordersList.get(0);
	}
	
	public String updateStatus(int ordId,String ordStatus) {
		String cmd = "Update Orders set ORD_STATUS=? WHERE ord_Id=?";
		jdbc.update(cmd, new Object[] {ordStatus,ordId});
		return "Order Accepted...";
	}
	
	
	public List<Orders> showVendorPendingOrders(int venId) {
		String cmd = "select * from Orders where ORD_STATUS='PENDING' AND ven_id=?";
		List<Orders> ordersList=null;
		ordersList=jdbc.query(cmd,new Object[] {venId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrdId(rs.getInt("ORD_ID"));
				orders.setEmailId(rs.getString("EMAIL_ID"));
				orders.setVenId(rs.getInt("VEN_ID"));
				orders.setWalSource(rs.getString("WAL_SOURCE"));
				orders.setOrdQuantity(rs.getInt("ORD_QUANTITY"));
				orders.setMenuId(rs.getInt("MENU_ID"));
				orders.setOrdDate(rs.getDate("ORD_DATE"));
				orders.setOrdBillamount(rs.getDouble("ORD_BILLAMOUNT"));
				orders.setOrdStatus(rs.getString("ORD_STATUS"));
				orders.setOrdComments(rs.getString("ORD_COMMENTS"));
				return orders;
			}
			
		});
		return ordersList;
	}
	
	public List<Orders> showVendorOrders(int venId) {
		String cmd = "select * from Orders where ven_id=?";
		List<Orders> ordersList=null;
		ordersList=jdbc.query(cmd,new Object[] {venId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrdId(rs.getInt("ORD_ID"));
				orders.setEmailId(rs.getString("EMAIL_ID"));
				orders.setVenId(rs.getInt("VEN_ID"));
				orders.setWalSource(rs.getString("WAL_SOURCE"));
				orders.setOrdQuantity(rs.getInt("ORD_QUANTITY"));
				orders.setMenuId(rs.getInt("MENU_ID"));
				orders.setOrdDate(rs.getDate("ORD_DATE"));
				orders.setOrdBillamount(rs.getDouble("ORD_BILLAMOUNT"));
				orders.setOrdStatus(rs.getString("ORD_STATUS"));
				orders.setOrdComments(rs.getString("ORD_COMMENTS"));
				return orders;
			}
			
		});
		return ordersList;
	}
	
	public List<Orders> showCustomerPendingOrders(String emailId) {
		String cmd = "select * from Orders where  cus_id=?";
		List<Orders> ordersList=null;
		ordersList=jdbc.query(cmd,new Object[] {emailId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrdId(rs.getInt("ORD_ID"));
				orders.setEmailId(rs.getString("EMAIL_ID"));
				orders.setVenId(rs.getInt("VEN_ID"));
				orders.setWalSource(rs.getString("WAL_SOURCE"));
				orders.setOrdQuantity(rs.getInt("ORD_QUANTITY"));
				orders.setMenuId(rs.getInt("MENU_ID"));
				orders.setOrdDate(rs.getDate("ORD_DATE"));
				orders.setOrdBillamount(rs.getDouble("ORD_BILLAMOUNT"));
				orders.setOrdStatus(rs.getString("ORD_STATUS"));
				orders.setOrdComments(rs.getString("ORD_COMMENTS"));
				return orders;
			}
			
		});
		return ordersList;
	}
	public List<Orders> showCustomerOrders(String emailId) {
		String cmd = "select * from Orders where ORD_STATUS='PENDING' AND cus_id=?";
		List<Orders> ordersList=null;
		ordersList=jdbc.query(cmd,new Object[] {emailId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrdId(rs.getInt("ORD_ID"));
				orders.setEmailId(rs.getString("EMAIL_ID"));
				orders.setVenId(rs.getInt("VEN_ID"));
				orders.setWalSource(rs.getString("WAL_SOURCE"));
				orders.setOrdQuantity(rs.getInt("ORD_QUANTITY"));
				orders.setMenuId(rs.getInt("MENU_ID"));
				orders.setOrdDate(rs.getDate("ORD_DATE"));
				orders.setOrdBillamount(rs.getDouble("ORD_BILLAMOUNT"));
				orders.setOrdStatus(rs.getString("ORD_STATUS"));
				orders.setOrdComments(rs.getString("ORD_COMMENTS"));
				return orders;
			}
			
		});
		return ordersList;
	}
}
