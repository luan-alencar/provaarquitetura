package david.augusto.luan.gatewayservice.service.mapper;


import java.util.List;

public interface EntityMapperModel<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(List<D> listDTO);

    List<D> toDTOList(List<E> listEntity);
}
