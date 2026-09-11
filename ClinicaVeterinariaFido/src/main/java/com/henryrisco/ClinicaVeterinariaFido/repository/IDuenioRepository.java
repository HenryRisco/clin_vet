package com.henryrisco.ClinicaVeterinariaFido.repository;

import com.henryrisco.ClinicaVeterinariaFido.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {

}
