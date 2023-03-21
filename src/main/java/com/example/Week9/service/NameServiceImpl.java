package com.example.Week9.service;

import com.example.Week9.entity.Name;
import com.example.Week9.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    private NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> findAll(){
        return nameMapper.findAll();
    }

}
