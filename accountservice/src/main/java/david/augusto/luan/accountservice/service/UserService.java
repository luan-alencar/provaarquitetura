package david.augusto.luan.accountservice.service;

import david.augusto.luan.accountservice.service.dto.UserDTO;
import david.augusto.luan.accountservice.service.dto.UserListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDTO create(UserDTO userDTO);

    UserDTO update(UserDTO userDTO);

    Page<UserListDTO> findAll(Pageable pageable);

    UserDTO getUser(Integer id);


}
