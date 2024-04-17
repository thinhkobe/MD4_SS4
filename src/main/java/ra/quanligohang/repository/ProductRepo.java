package ra.quanligohang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.quanligohang.model.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
}
