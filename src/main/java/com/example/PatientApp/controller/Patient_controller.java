package com.example.PatientApp.controller;


import com.example.PatientApp.Dao.PatientsDao;
import com.example.PatientApp.Model.Patient_model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class Patient_controller {

    @Autowired
    private PatientsDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> add(@RequestBody Patient_model p){

        System.out.println(p.getId());
        HashMap<String,String> res =new HashMap<>();
        res.put("Status","success");
        dao.save(p);
        return res;
    }

    @CrossOrigin("*")
    @GetMapping("/view")
    public List<Patient_model> view_Patients(){
        return (List<Patient_model>)dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/seaarch",consumes = "application/json",produces = "application/json")
    public List<Patient_model> srchPatients(@RequestBody Patient_model p){
        return (List<Patient_model>)dao.serchPatients(p.getId());
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public HashMap<String,String> deletePatients(@RequestBody Patient_model p){
        HashMap<String ,String> res = new HashMap<>();
        res.put("status","success");

        dao.delete(p.getId());
        return res;
    }
}
