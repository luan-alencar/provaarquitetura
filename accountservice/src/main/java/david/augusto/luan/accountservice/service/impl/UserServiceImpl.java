package david.augusto.luan.accountservice.service.impl;

import david.augusto.luan.accountservice.service.UserService;
import david.augusto.luan.accountservice.service.dto.UserDTO;
import david.augusto.luan.accountservice.service.dto.UserListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class UserServiceImpl implements UserService {

    @Override
    public UserDTO create(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }

    @Override
    public Page<UserListDTO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public UserDTO getUser(Integer id) {
        return null;
    }
}
