package david.augusto.luan.gatewayservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    @Column(unique = true)
    private String login;

    @Column(unique = true)
    private String password;
}
