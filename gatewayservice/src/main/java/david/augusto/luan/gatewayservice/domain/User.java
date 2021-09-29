package david.augusto.luan.gatewayservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Getter
@Setter
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String USER_ACTIVE = "ACTIVE";
    private static final String USER_INACTIVE = "INACTIVE";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USER")
    private Long id;

    @JsonIgnore
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "password", length = 60, nullable = false)
    private String password;

    @Size(max = 50)
    @Column(name = "first_name", length = 50)
    private String firstName;

    @Size(max = 50)
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Email
    @Size(min = 5, max = 255)
    @Column(length = 255, unique = true)
    private String email;

}


