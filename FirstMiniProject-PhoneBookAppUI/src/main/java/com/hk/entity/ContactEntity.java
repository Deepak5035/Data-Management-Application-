package com.hk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "CONTACT_DTLS")
public class ContactEntity {
	@Id
	@Column(name = "CONTACT_ID")
	@SequenceGenerator(name = "cid_seq_gen",
	                   sequenceName = "CONTACT_ID_SEQ" ,        
	                   allocationSize = 1)
	//we have to supply same vale which are given in seq creation ei increment_by
		                                     	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_seq_gen")
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;
	
	@Column(name = "CREATED_DATE")
	@CreationTimestamp   //by using this annotation value is inserted for createdDate automatically programer is not responsible to set
	@Temporal(TemporalType.DATE)   // in which format data will set in createdDate 
	private Date createdDate;
	
	@Column(name= "UPDATED_DATE")
	@UpdateTimestamp    //when ever "updatedDate" is updated that time variable will populated with current date format (mention in @Temprol)
	@Temporal(TemporalType.DATE)
	
	private Date updatedDate;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
 
}
