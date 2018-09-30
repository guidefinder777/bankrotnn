package ru.nn.bankrot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.nn.bankrot.dto.ContactDTO;
import ru.nn.bankrot.dto.GridDTO;
import ru.nn.bankrot.service.ContactService;

/**
 * Created by Parfenov on 29.09.2018
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    private static final Logger logger = LogManager.getLogger(ContactController.class);

    @RequestMapping(method = RequestMethod.POST, value = "/save")
    @ResponseBody
    public ContactDTO save(@RequestBody ContactDTO contactDTO) {
        logger.info(contactDTO.toString());

        return contactService.save(contactDTO);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/find")
    @ResponseBody
    public GridDTO find() {
        return contactService.find();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    @ResponseBody
    public ContactDTO get(@RequestParam("id") Integer id) {
        return contactService.get(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestParam("id") Integer id) {
        contactService.delete(id);
    }


}
