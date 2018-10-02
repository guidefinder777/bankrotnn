package ru.nn.bankrot.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.UserEntity;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Session getCurrent() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    @Override
    public UserEntity save(UserEntity userEntity) {
        return null;
    }

    @Transactional
    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Transactional
    @Override
    public UserEntity get(Integer id) {
        return null;
    }

    @Transactional
    @Override
    public void delete(UserEntity userEntity) {

    }

    @Transactional
    @Override
    public UserEntity findByUserName(String name) {
        return (UserEntity) getCurrent().createQuery("from user where fio=:fio ", UserEntity.class)
                .setParameter("fio", name).getSingleResult();
    }
}
