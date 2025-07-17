package lk.ijse.gdse.smsbackend.repo;

import lk.ijse.gdse.smsbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
