package att.services;

import att.db.User;
import att.dto.UserDto;
import att.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static att.mapper.UserMapper.toEntity;

@Service
public class UserServices
{
    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public void createUser(UserDto userDto)
    {
        User user = toEntity(userDto);
        this.userRepository.save(user);
    }
}
