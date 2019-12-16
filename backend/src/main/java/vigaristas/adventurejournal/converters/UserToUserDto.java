package vigaristas.adventurejournal.converters;

import org.springframework.stereotype.Component;
import vigaristas.adventurejournal.command.UserDto;
import vigaristas.adventurejournal.persistence.model.User;

@Component
public class UserToUserDto extends AbstractConverter<User, UserDto> {


    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();

        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setMd5Passwd(user.getMd5passwd());

        return userDto;
    }
}
