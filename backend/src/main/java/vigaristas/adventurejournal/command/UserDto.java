package vigaristas.adventurejournal.command;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDto {

    private Integer id;

    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String md5Passwd;

    @Email
    @NotBlank
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMd5Passwd() {
        return md5Passwd;
    }

    public void setMd5Passwd(String md5Passwd) {
        this.md5Passwd = md5Passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", md5Passwd='" + md5Passwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
