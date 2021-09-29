package david.augusto.luan.gatewayservice.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CredenciaisDTO implements Serializable {

    private static final long serialVersionUID = -7559065379012616434L;

    private String email;
    private String senha;
}
