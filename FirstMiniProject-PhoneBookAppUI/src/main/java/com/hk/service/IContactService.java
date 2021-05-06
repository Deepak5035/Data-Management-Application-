package com.hk.service;

import java.util.List;

import com.hk.model.Contact;

public interface IContactService {
	
	boolean saveContact(Contact c);
	
	List<Contact> getAllContacts( );
	
	Contact getContactById(Integer cid);
	
	boolean updateContact(Contact c);
	
	boolean deleteContact(Integer cid);

}
