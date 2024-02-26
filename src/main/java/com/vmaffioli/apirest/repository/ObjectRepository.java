package com.vmaffioli.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vmaffioli.apirest.entity.ObjectEntity;

public interface ObjectRepository extends JpaRepository<ObjectEntity, Integer> {

}
