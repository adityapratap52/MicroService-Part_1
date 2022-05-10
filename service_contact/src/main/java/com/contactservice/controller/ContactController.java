package com.contactservice.controller;

import com.contactservice.model.Contact;
import com.contactservice.service.ContactServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactServiceImp contactServiceImp;

    @GetMapping("/{cId}")
    public List<Contact> getContacts(@PathVariable("cId") Integer cId) {

        return contactServiceImp.getContacts(cId);
    }
}
