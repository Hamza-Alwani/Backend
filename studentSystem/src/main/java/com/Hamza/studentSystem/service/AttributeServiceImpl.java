package com.Hamza.studentSystem.service;

import com.Hamza.studentSystem.model.Attribute;
import com.Hamza.studentSystem.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttributeServiceImpl implements AttributeService{

    @Autowired
    private AttributeRepository attributeRepository;

    @Override
    public List<Attribute> getAllAttributes() {
        return attributeRepository.findAll();
    }
}
