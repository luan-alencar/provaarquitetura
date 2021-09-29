package david.augusto.luan.gatewayservice.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
