package shop.mtcoding.buyer3.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

// username, password, email, created_at
@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}
