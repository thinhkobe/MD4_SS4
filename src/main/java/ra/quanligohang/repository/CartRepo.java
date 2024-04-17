package ra.quanligohang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ra.quanligohang.model.entity.Cart;

import java.util.List;

@Repository
@Transactional
public interface CartRepo extends JpaRepository<Cart,String> {
    List<Cart> findAllByUsersUserId(String userId);
    void deleteAllByUsersUserId(String id);

}
