package david.augusto.luan.gatewayservice.service.mapper;

import david.augusto.luan.gatewayservice.domain.User;
import david.augusto.luan.gatewayservice.service.dto.UserDTO;
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
