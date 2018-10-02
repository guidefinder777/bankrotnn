package ru.nn.bankrot.dao;

import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.ContactEntity;
import ru.nn.bankrot.enitty.UserEntity;
import ru.nn.bankrot.filter.ContactFilter;

import java.util.List;

/**
 * Created by adm on 01.10.2018.
 */
public interface UserDao {

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
