package com.idat.microservicioidatio.service;

import com.idat.microservicioidatio.model.Hospital;
import com.idat.microservicioidatio.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private EstudianteRepository repository;
    @Override
    public List<Hospital> listar(){
        return repository.findAll();
    }

}
