package com.idat.microservicioidatio.controller;

import com.idat.microservicioidatio.model.Hospital;
import com.idat.microservicioidatio.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hospital/v1")
public class HospitalController {
    @Autowired
    private HospitalService service;

    @GetMapping(path= "/listar")
    public @ResponseBody
    List<Hospital> listar(){
        return service.listar();
    }





}
