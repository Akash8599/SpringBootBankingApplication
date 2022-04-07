package Model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "tbl_user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_Id")
    private Integer userID;

    @Column(name = "user_name")
    private String username;

    @Column(name = "email_Id")
    private String emailId;

    private Integer age;



}
