package david.augusto.luan.accountservice.service.mapper;

import david.augusto.luan.accountservice.domain.User;
import david.augusto.luan.accountservice.service.dto.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends EntityMapperModel<UserDTO, User> {

    @Override
    User toEntity(UserDTO dto);

    @Override
    UserDTO toDto(User entity);

    @Override
    List<User> toEntity(List<UserDTO> dtoList);

    @Override
    List<UserDTO> toDto(List<User> entityList);
}
