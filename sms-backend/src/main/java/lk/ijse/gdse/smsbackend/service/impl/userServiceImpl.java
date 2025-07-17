package lk.ijse.gdse.smsbackend.service.impl;

import lk.ijse.gdse.smsbackend.dto.UserDto;
import lk.ijse.gdse.smsbackend.entity.User;
import lk.ijse.gdse.smsbackend.repo.UserRepo;
import lk.ijse.gdse.smsbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class userServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public void saveUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
    }

    @Override
    public UserDto loginUser(String email, String password) {
        Optional<User> users =userRepo.findByEmailAndPassword(email , password);
        if(users.isPresent()){
            User user = users.get();
            return new UserDto(user.getUsername(),user.getPassword(),user.getEmail());
        }else{
            return null;
        }
    }
}
