package com.idat.microservicioidatio.repository;


import com.idat.microservicioidatio.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Hospital,Integer> {
}
