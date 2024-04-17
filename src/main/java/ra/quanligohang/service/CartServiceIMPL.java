package ra.quanligohang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.quanligohang.model.entity.Cart;
import ra.quanligohang.model.entity.request.CartRequest;
import ra.quanligohang.repository.CartRepo;
import ra.quanligohang.repository.ProductRepo;
import ra.quanligohang.repository.UserRepo;

import java.util.List;

@Service
public class CartServiceIMPL implements ICartService {
    @Autowired
    private CartRepo cartRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ProductRepo productRepo;


    @Override
    public List<Cart> findCartByUserId(String userID) {
        return cartRepo.findAllByUsersUserId(userID);
    }

    @Override
    public Cart addNewCart(CartRequest cartRequest) {
        Cart cart = new Cart();
        cart.setUsers(userRepo.findById(cartRequest.getUserId()).orElse(null));
        cart.setProduct(productRepo.findById(cartRequest.getProductId()).orElse(null));
        cart.setQuantity(cartRequest.getQuantity());
        return cartRepo.save(cart);
    }

    @Override
    public Cart updateQuantily(CartRequest cartRequest, String cartId) {
        Cart cart=cartRepo.findById(cartId).orElse(null);
        assert cart != null;
        cart.setQuantity(cartRequest.getQuantity());
        return cartRepo.save(cart);
    }

    @Override
    public void deleteAllByUserId(String id) {
        cartRepo.deleteAllByUsersUserId(id);
    }
}
