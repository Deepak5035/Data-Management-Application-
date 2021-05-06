package com.hk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hk.entity.ContactEntity;

public interface ContectRepository extends JpaRepository<ContactEntity, Serializable> {


  }
