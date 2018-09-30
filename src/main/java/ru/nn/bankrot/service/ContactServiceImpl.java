package ru.nn.bankrot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nn.bankrot.dao.ContactDao;
import ru.nn.bankrot.dto.ContactDTO;
import ru.nn.bankrot.dto.GridDTO;
import ru.nn.bankrot.enitty.ContactEntity;
import ru.nn.bankrot.filter.ContactFilter;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Parfenov on 30.09.2018
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;


    @Override
    public ContactDTO save(ContactDTO contactDTO) {
        ContactEntity contactEntity = null;
        if (contactDTO.getId() != null) {
            contactEntity = contactDao.get(contactDTO.getId());
            contactEntity = contactEntity.convert(contactDTO);
        } else {
            contactEntity = new ContactEntity().convert(contactDTO);
            contactEntity.setCreatedDate(new Date());
        }


        ContactEntity contact = contactDao.save(contactEntity);
        return ContactDTO.convert(contact);
    }


    @Override
    public GridDTO find() {
        ContactFilter contactFilter = new ContactFilter();
        contactFilter.setOrderName("createdDate");
        contactFilter.setAscending(false);
        List<ContactEntity> items = contactDao.find(contactFilter);
        Long count = contactDao.count(contactFilter);


        List<ContactDTO> contactDTOS = items.stream().map(contactEntity -> ContactDTO.convert(contactEntity)).collect(Collectors.toList());
        return new GridDTO(contactDTOS, count);
    }

    @Override
    public ContactDTO get(Integer id) {
        return ContactDTO.convert(contactDao.get(id));
    }

    @Override
    public void delete(Integer id){
        ContactEntity contactEntity = contactDao.get(id);

        contactDao.delete(contactEntity);
    }
}
