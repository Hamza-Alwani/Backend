package com.Hamza.studentSystem.repository;

import com.Hamza.studentSystem.model.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute,Integer> {

}
