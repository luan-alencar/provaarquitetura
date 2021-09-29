package david.augusto.luan.accountservice.service.mapper;

import java.util.List;
import java.util.Set;

public interface EntityMapperModel<D, E> {

    /**
     * Converte para entidade
     */
    E toEntity(D dto);

    /**
     * Converte para DTO
     */
    D toDto(E entity);

    /**
     * Converte uma lista de DTOs para uma lista de entidades
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * Converte uma lista de entidades em uma lista de DTOs
     */
    List<D> toDto(List<E> entityList);

    /**
     * Converte uma lista de DTOs para uma lista de entidades
     */
    Set<E> toEntity(Set<D> dtoList);

    /**
     * Converte uma lista de entidades em uma lista de DTOs
     */
    Set<D> toDto(Set<E> entityList);

}
