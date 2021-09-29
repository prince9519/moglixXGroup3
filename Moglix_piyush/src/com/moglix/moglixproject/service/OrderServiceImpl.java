package com.moglix.moglixproject.service;

import com.moglix.moglixproject.repository.OrderDAO;
import com.moglix.moglixproject.repository.OrderDAOImpl;
import com.moglix.mogproject.dto.Order;

public abstract class OrderServiceImpl implements OrderSevice {

	OrderDAO orderDAO = OrderDAOImpl.getinstance();
	private static OrderSevice orderSevice;
	@Override
	public String addorder(Order order) {
		// TODO Auto-generated method stub
		return orderDAO.addorder(order);
	}

	@Override
	public String updateOrderbyId(Order order, String id) {
		// TODO Auto-generated method stub
		return orderDAO.updateOrderbyId(order, id);
	}

	@Override
	public String deleteorderbyId(String id) {
		// TODO Auto-generated method stub
		return orderDAO.deleteorderbyId(id);
	}

	@Override
	public String deleteAllorder() {
		// TODO Auto-generated method stub
      return orderDAO.deleteAllorder();
	}

}
