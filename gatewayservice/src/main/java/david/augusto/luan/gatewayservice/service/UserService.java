package david.augusto.luan.gatewayservice.service;

import david.augusto.luan.gatewayservice.domain.User;
import david.augusto.luan.gatewayservice.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends ServiceEntityGeneric<User, UserDTO> {

    @Override
    List<UserDTO> findAll();

    @Override
    UserDTO getByID(Long id);

    @Override
    UserDTO save(User entity);

    @Override
    UserDTO update(User entity);

    @Override
    void delete(Long id);
}
