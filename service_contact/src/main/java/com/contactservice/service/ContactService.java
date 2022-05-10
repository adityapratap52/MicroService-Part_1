package com.contactservice.service;


import com.contactservice.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getContacts(Integer userId);
}
