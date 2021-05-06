package com.hk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.hk.model.Contact;
import com.hk.service.IContactService;
import com.hk.service.ImplContactService;

public class ServiceTest {
     @Test
	public void saveContactTest() {
		
    	
		IContactService ics=new ImplContactService();
    	Contact c=new Contact();
    	c.setContactEmail("yadavdeepak5045@gmail.com");
    	c.setContactName("Deepak");
    	c.setContactNumber(6393188838L);
    	c.setCreatedDate(new Date());
    	c.setUpdatedDate(new Date());
    	//c.setContactId(10);
    	
		boolean actualResult=ics.saveContact(c);
	    boolean ExpactedResult=true;
	    
	    assertEquals(ExpactedResult, actualResult);
	}
	
	
}
