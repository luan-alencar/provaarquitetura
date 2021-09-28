package luan.example.gatewayservice.service.mapper;

import luan.example.gatewayservice.domain.User;

import java.util.List;

public interface EntityMapperModel<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(List<D> listDTO);

    List<D> toDTOList(List<E> listEntity);
}
