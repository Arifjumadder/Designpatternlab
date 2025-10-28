

package com.shashi.service;

import java.util.List;

import com.shashi.beans.CartBean;

public interface CartService {

	public String addProductToCart(addproductcart info);

	public String updateProductToCart(updateproduct info);

	public List<CartBean> getAllCartItems(String userId);

	public int getCartCount(String userId);

	public int getCartItemCount(String userId, String itemId);

	public String removeProductFromCart(String userId, String prodId);

	public boolean removeAProduct(String userId, String prodId);

}

class addproductcart{
	String userId,productId,productquantity;
	addproductcart(String userId, String productId,String productquantity)

	this.userId=userId;
	this.productId=productId;
	this.productquantity=productquantity;
}

class updateproductinfo{
	String userId,proId,proquantity;
	addproductcart(String userId, String proId,String proquantity)

	this.userId=userId;
	this.prodId=proId;
	this.proquantity=proquantity;
}






