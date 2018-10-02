package ru.nn.bankrot.service;

import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity save(UserEntity userEntity);

    @Transactional(readOnly = true)
    List<UserEntity> findAll();

    @Transactional(readOnly = true)
    UserEntity get(Integer id);

    @Transactional(readOnly = false)
    void delete(UserEntity userEntity);

    @Transactional
    UserEntity findByUserName(String name);

}
