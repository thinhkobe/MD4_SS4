package ra.quanligohang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.quanligohang.model.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users,String> {
}
