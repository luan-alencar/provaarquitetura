package david.augusto.luan.gatewayservice.security.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Perfil {

    ADMIN(1L, "ROLE_ADMIN"), CLIENTE(2L, "ROLE_CLIENTE");

    private Long id;
    private String descricao;

    // Este método eu posso rodar mesmo sem ter o objeto instânciado
    public static Perfil toEnum(Long id) {

        if (Objects.isNull(id)) {
            return null;
        }

        for (Perfil e : Perfil.values()) {
            if (id.equals(e.getId())) {
                return e;
            }
        }
        throw new IllegalArgumentException("ID inválido: " + id);
    }}
