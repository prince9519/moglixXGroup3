package com.moglix.moglixproject.service;

import com.moglix.mogproject.dto.Order;

public interface OrderSevice {

	public String addorder(Order order);
	public String updateOrderbyId(Order order, String id);
	public String deleteorderbyId(String id);
	public String deleteAllorder();
	public Order getOrderById(String id);
	public Order[] getorders();
}
