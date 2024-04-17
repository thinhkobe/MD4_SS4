package ra.quanligohang.service;

import ra.quanligohang.model.entity.Cart;
import ra.quanligohang.model.entity.request.CartRequest;

import java.util.List;

public interface ICartService {
    List<Cart> findCartByUserId(String userID);
    Cart addNewCart(CartRequest cartRequest);
    Cart updateQuantily(CartRequest cartRequest,String cartId);

    void deleteAllByUserId(String id);
}
