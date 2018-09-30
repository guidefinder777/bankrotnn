package ru.nn.bankrot.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.ContactEntity;
import ru.nn.bankrot.filter.ContactFilter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Parfenov on 30.09.2018
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public ContactEntity save(ContactEntity contactEntity) {
        return (ContactEntity) sessionFactory.getCurrentSession().merge(contactEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ContactEntity> find(ContactFilter contactFilter) {
        CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<ContactEntity> query = builder.createQuery(ContactEntity.class);
        Root<ContactEntity> root = query.from(ContactEntity.class);
        query.select(root);
        if (contactFilter.getOrderName() != null) {
            if (contactFilter.isAscending()) {
                query.orderBy(builder.asc(root.get(contactFilter.getOrderName())));
            } else {
                query.orderBy(builder.desc(root.get(contactFilter.getOrderName())));
            }

        }

        Query<ContactEntity> q = sessionFactory.getCurrentSession().createQuery(query);

        q.setFirstResult(contactFilter.getPaginator().getRow() * contactFilter.getPaginator().getLimit());
        q.setMaxResults(contactFilter.getPaginator().getLimit());

        return q.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Long count(ContactFilter contactFilter) {
        CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<ContactEntity> root = query.from(ContactEntity.class);
        query.select(builder.count(root));

        Query<Long> q = sessionFactory.getCurrentSession().createQuery(query);

        return q.getSingleResult();
    }

    @Override
    @Transactional(readOnly = true)
    public ContactEntity get(Integer id) {
        return sessionFactory.getCurrentSession().find(ContactEntity.class, id);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(ContactEntity contactEntity){
        sessionFactory.getCurrentSession().delete(contactEntity);
    }
}
