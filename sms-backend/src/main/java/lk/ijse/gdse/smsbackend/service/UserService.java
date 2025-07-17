package lk.ijse.gdse.smsbackend.service;

import lk.ijse.gdse.smsbackend.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(UserDto userDto);
}
