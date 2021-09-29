package com.moglix.moglixproject.service;

import com.moglix.moglixproject.repository.CartDAO;
import com.moglix.moglixproject.repository.CartDAOImpl;
import com.moglix.mogproject.dto.Cart;

public abstract class CartServiceImpl implements CartService {

	CartDAO cartDao = CartDAOImpl.getinstance();
	@Override
	public String addCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.addCart(cart);
	}

	@Override
	public String updateCartbyId(Cart cart, String id) {
		// TODO Auto-generated method stub
		return cartDao.updateCartbyId(cart, id);
	}

	@Override
	public String deleteCartbyId(String id) {
		// TODO Auto-generated method stub
		return cartDao.deleteCartbyId(id);
	}

	@Override
	public String deleteAllCart() {
		// TODO Auto-generated method stub
		return cartDao.deleteAllCart();
	}

	@Override
	public Cart getCartById(String id) {
		// TODO Auto-generated method stub
		return cartDao.getCartById(id);
	}

	@Override
	public Cart[] getCarts() {
		// TODO Auto-generated method stub
		return cartDao.getCarts();
	}

}
