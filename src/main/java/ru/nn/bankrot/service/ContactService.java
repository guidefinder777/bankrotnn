package ru.nn.bankrot.service;

import ru.nn.bankrot.dto.ContactDTO;
import ru.nn.bankrot.dto.GridDTO;

/**
 * Created by Parfenov on 30.09.2018
 */
public interface ContactService {
    ContactDTO save(ContactDTO contactDTO);

    GridDTO find();

    ContactDTO get(Integer id);

    void delete(Integer id);
}
