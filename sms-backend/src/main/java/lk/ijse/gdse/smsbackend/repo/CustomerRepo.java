package lk.ijse.gdse.smsbackend.repo;

import lk.ijse.gdse.smsbackend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
