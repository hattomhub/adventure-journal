package vigaristas.adventurejournal.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "userTable")
public class User extends AbstractModel {

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "email", unique = true)
    private String email;

    private String md5passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMd5passwd() {
        return md5passwd;
    }

    public void setMd5passwd(String md5passwd) {
        this.md5passwd = md5passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
