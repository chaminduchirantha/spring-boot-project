package lk.ijse.gdse.smsbackend.controller;

import lk.ijse.gdse.smsbackend.dto.CustomerDto;
import lk.ijse.gdse.smsbackend.entity.Customer;
import lk.ijse.gdse.smsbackend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("create")
    public void saveCustomer(@RequestBody CustomerDto customerDto) {
        customerService.saveCustomer(customerDto);
    }

    @PutMapping("update")
    public void updateCustomer(@RequestBody CustomerDto customerDto) {
        customerService.update(customerDto);
    }

    @GetMapping("get")
    public List<CustomerDto> getCustomer(){
        return customerService.get();
    }

}
