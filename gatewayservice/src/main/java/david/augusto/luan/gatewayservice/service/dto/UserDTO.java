package david.augusto.luan.gatewayservice.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String password;
}
