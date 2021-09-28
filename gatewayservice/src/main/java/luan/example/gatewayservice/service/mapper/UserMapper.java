package luan.example.gatewayservice.service.mapper;

import luan.example.gatewayservice.domain.User;
import luan.example.gatewayservice.service.dto.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends EntityMapperModel<User, UserDTO> {

    @Override
    User toEntity(UserDTO dto);

    @Override
    UserDTO toDTO(User entity);

    @Override
    List<User> toEntityList(List<UserDTO> listDTO);

    @Override
    List<UserDTO> toDTOList(List<User> listEntity);
}
