package ru.nn.bankrot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nn.bankrot.dao.UserDao;
import ru.nn.bankrot.enitty.UserEntity;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userDao.save(userEntity);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    @Override
    public UserEntity get(Integer id) {
        return userDao.get(id);
    }

    @Override
    public void delete(UserEntity userEntity) {
        userDao.delete(userEntity);
    }

    @Override
    public UserEntity findByUserName(String name) {
        return userDao.findByUserName(name);
    }
}
