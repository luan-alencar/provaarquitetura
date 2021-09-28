package david.augusto.luan.gatewayservice.service.impl;

import david.augusto.luan.gatewayservice.domain.User;
import david.augusto.luan.gatewayservice.repository.UserRepository;
import david.augusto.luan.gatewayservice.service.ServiceEntityGeneric;
import david.augusto.luan.gatewayservice.service.dto.UserDTO;
import david.augusto.luan.gatewayservice.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements ServiceEntityGeneric<User, UserDTO> {

    private final UserMapper mapper;
    private final UserRepository repository;

    @Override
    public List<UserDTO> findAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public UserDTO getByID(Long id) {
        return mapper.toDTO(repository.getOne(id));
    }

    @Override
    public UserDTO save(User entity) {
        return mapper.toDTO(repository.save(entity));
    }

    @Override
    public UserDTO update(User entity) {
        return this.save(entity);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
