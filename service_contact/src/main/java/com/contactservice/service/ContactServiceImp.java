package com.contactservice.service;

import com.contactservice.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImp implements ContactService {

    List<Contact> list = List.of(
            new Contact(1, "adi@gmail.com", "Rahul", 1311),
            new Contact(2, "pra@gmail.com", "Shyam", 1312),
            new Contact(3, "arn@gmail.com", "Ram", 1313),
            new Contact(4, "tyf@gmail.com", "Mohan", 1313)
    );

    @Override
    public List<Contact> getContacts(Integer userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
