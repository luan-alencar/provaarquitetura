package david.augusto.luan.gatewayservice.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceEntityGeneric<E, D> {

    List<D> findAll();

    D getByID(Long id);

    D save(E entity);

    D update(E entity);

    void delete(Long id);
}
