package ru.nn.bankrot.dao;

import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.ContactEntity;
import ru.nn.bankrot.filter.ContactFilter;

import java.util.List;

/**
 * Created by Parfenov on 30.09.2018
 */
public interface ContactDao {
    ContactEntity save(ContactEntity contactEntity);

    @Transactional(readOnly = true)
    List<ContactEntity> find(ContactFilter contactFilter);

    @Transactional(readOnly = true)
    Long count(ContactFilter contactFilter);

    @Transactional(readOnly = true)
    ContactEntity get(Integer id);

    @Transactional(readOnly = false)
    void delete(ContactEntity contactEntity);
}
