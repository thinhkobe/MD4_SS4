package ra.quanligohang.api.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.quanligohang.model.entity.Cart;
import ra.quanligohang.model.entity.request.CartRequest;
import ra.quanligohang.service.ICartService;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartApi {
    @Autowired
    private ICartService iCartService;

    @GetMapping("/{id}")
    public ResponseEntity<List<Cart>> findCartsByUserID(@PathVariable String id) {
        List<Cart> cartList = iCartService.findCartByUserId(id);
        return new ResponseEntity<>(cartList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cart> addNewCart(@RequestBody CartRequest cartRequest) {
        return new ResponseEntity<>(iCartService.addNewCart(cartRequest), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cart> updateQuantily(@RequestBody CartRequest cartRequest, @PathVariable String id) {
        return new ResponseEntity<>(iCartService.updateQuantily(cartRequest, id), HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteAllCartByUserId(@PathVariable String userId){
        iCartService.deleteAllByUserId(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
