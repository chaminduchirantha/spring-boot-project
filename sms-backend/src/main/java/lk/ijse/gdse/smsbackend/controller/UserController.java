package lk.ijse.gdse.smsbackend.controller;

import lk.ijse.gdse.smsbackend.dto.UserDto;
import lk.ijse.gdse.smsbackend.entity.User;
import lk.ijse.gdse.smsbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping("create")
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }

    @PostMapping("login")
    public UserDto loginUser(@RequestBody UserDto userDto) {
        return userService.loginUser(userDto.getEmail(), userDto.getPassword());
    }
}
