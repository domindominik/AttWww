package att.mapper;

import att.db.User;
import att.dto.UserDto;

public class UserMapper
{
    public static User toEntity(UserDto userDto)
    {
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }

    public static UserDto toDto(User user)
    {
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setEmail(user.getEmail());
        userDto.setEmail(user.getPassword());
        return userDto;
    }

}
