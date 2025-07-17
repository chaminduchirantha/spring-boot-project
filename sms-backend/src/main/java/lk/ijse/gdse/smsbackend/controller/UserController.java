package lk.ijse.gdse.smsbackend.controller;

import lk.ijse.gdse.smsbackend.dto.UserDto;
import lk.ijse.gdse.smsbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("create")
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
