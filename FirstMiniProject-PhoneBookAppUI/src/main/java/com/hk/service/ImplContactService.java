package com.hk.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.entity.ContactEntity;
import com.hk.model.Contact;
import com.hk.repository.ContectRepository;
@Service
public class ImplContactService implements IContactService {
	
	@Autowired
	private ContectRepository repo;


	@Override
	public boolean saveContact(Contact c) {
		ContactEntity entity=new ContactEntity();
		BeanUtils.copyProperties(c, entity);
	    ContactEntity entity1=repo.save(entity);
		return entity1.getContactId()!=null;
	}

	@Override
	public List<Contact> getAllContacts() {
		//legcy approach
		List<ContactEntity> entities=repo.findAll();
		
		
		
/*		 
		  for(ContactEntity entity: entities) {
			  Contact  contact=new Contact(); 
			  BeanUtils.copyProperties(entity, contact);
		      contacts.add(contact);
		      } 
		  return contacts;  */
		 
		
		//using java 8
		return entities.stream().map(entity -> {
			          Contact contact=new Contact();
			          BeanUtils.copyProperties(entity,contact);
			          return contact;
		   }).collect(Collectors.toList());
	}
	

	@Override
	public Contact getContactById(Integer cid) {
		  Optional<ContactEntity> optional = repo.findById(cid);
		  if(optional.isPresent()) {
			  ContactEntity entity=optional.get();
			  Contact contact=new Contact();
			  BeanUtils.copyProperties(entity, contact);
			  return contact;
		  }
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		repo.deleteById(cid);
		return true;
	}




}
