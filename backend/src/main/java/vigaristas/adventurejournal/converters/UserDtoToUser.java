package vigaristas.adventurejournal.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import vigaristas.adventurejournal.command.UserDto;
import vigaristas.adventurejournal.persistence.model.User;
import vigaristas.adventurejournal.services.UserService;

@Component
public class UserDtoToUser implements Converter<UserDto, User> {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public User convert(UserDto userDto) {

        User user = (userDto.getId() != null ? userService.get(userDto.getId()) : new User());

        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setMd5passwd(userDto.getMd5Passwd());

        return user;
    }
}
