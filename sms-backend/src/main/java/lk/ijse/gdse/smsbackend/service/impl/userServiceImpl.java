package lk.ijse.gdse.smsbackend.service.impl;

import lk.ijse.gdse.smsbackend.dto.UserDto;
import lk.ijse.gdse.smsbackend.entity.User;
import lk.ijse.gdse.smsbackend.repo.UserRepo;
import lk.ijse.gdse.smsbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public void saveUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
    }
}
