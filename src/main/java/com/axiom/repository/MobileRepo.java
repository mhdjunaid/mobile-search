package com.axiom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.axiom.model.Mobile;

@RepositoryRestResource
public interface MobileRepo extends JpaRepository<Mobile, Long>, JpaSpecificationExecutor<Mobile>{

}