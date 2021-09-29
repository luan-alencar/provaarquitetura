package david.augusto.luan.accountservice.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
