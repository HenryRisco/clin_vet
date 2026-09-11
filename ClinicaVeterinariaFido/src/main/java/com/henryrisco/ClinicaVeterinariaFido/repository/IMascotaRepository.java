package com.henryrisco.ClinicaVeterinariaFido.repository;

import com.henryrisco.ClinicaVeterinariaFido.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
