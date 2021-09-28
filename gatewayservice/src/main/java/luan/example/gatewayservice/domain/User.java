package luan.example.gatewayservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 441108583833005921L;

    private Long id;
    private String name;
    private String email;
    private String password;
}
