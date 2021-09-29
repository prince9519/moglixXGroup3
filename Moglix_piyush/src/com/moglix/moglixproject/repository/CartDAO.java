package com.moglix.moglixproject.repository;

import com.moglix.mogproject.dto.Cart;

public interface CartDAO {

	public String addCart(Cart cart);
	public String updateCartbyId(Cart cart, String id);
	public String deleteCartbyId(String id);
	public String deleteAllCart();
	public Cart getCartById(String id);
	public Cart[] getCarts();
}
