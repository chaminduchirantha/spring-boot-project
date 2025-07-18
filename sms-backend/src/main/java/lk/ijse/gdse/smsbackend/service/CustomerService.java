package lk.ijse.gdse.smsbackend.service;

import lk.ijse.gdse.smsbackend.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    void saveCustomer(CustomerDto customerDto);
    void update(CustomerDto customerDto);
    List<CustomerDto> get();
}
