package com.example.PatientApp.Dao;

import com.example.PatientApp.Model.Patient_model;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientsDao extends CrudRepository<Patient_model,Integer> {

    @Query(value = "SELECT `id`, `age`, `doctor`, `img`, `name` FROM `patients` WHERE id = :id",nativeQuery = true)
    List<Patient_model> serchPatients(@Param("id")Integer id);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id`= :id",nativeQuery = true)
    public void delete(@Param("id")Integer id);
}
