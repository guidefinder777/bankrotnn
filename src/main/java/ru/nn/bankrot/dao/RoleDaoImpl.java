package ru.nn.bankrot.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.RoleEntity;

public class RoleDaoImpl implements RoleDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Session getCurrent() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    @Override
    public RoleEntity getById(Integer id) {
        return getCurrent().find(RoleEntity.class, id);
    }
}
