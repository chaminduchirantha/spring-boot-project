package lk.ijse.gdse.smsbackend.service.impl;

import lk.ijse.gdse.smsbackend.dto.CustomerDto;
import lk.ijse.gdse.smsbackend.entity.Customer;
import lk.ijse.gdse.smsbackend.repo.CustomerRepo;
import lk.ijse.gdse.smsbackend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    private final ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        customerRepo.save(modelMapper.map(customerDto, Customer.class));
    }

    @Override
    public void update(CustomerDto customerDto) {
        customerRepo.save(modelMapper.map(customerDto, Customer.class));
    }
}
