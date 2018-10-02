package ru.nn.bankrot.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.nn.bankrot.dao.RoleDao;
import ru.nn.bankrot.enitty.RoleEntity;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public RoleEntity getById(Integer id) {
        return roleDao.getById(id);
    }
}
