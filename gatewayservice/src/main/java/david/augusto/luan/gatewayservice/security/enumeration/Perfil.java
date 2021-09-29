package david.augusto.luan.gatewayservice.security.enumeration;

import lombok.Getter;

import java.util.Objects;

@Getter
public enum Perfil {

    ADMIN(1L, "ROLE_ADMIN"), CLIENTE(2L, "ROLE_CLIENTE");

    private Long id;
    private String descricao;

    private Perfil(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // Este método eu posso rodar mesmo sem ter o objeto instânciado
    public static Perfil toEnum(Long id) {

        if (Objects.isNull(id)) {
            return null;
        }

        for (Perfil perfil : Perfil.values()) {
            if (id.equals(perfil.getId())) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("ID inválido: " + id);
    }}
