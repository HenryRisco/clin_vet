package com.henryrisco.ClinicaVeterinariaFido.service;

import com.henryrisco.ClinicaVeterinariaFido.model.Duenio;
import com.henryrisco.ClinicaVeterinariaFido.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DuenioService implements IDuenioService{

    @Autowired
    private IDuenioRepository duenioRepository;

    //método para traer todos los duenios
    @Override
    public List<Duenio> getDuenios() {

        return duenioRepository.findAll();
    }

    //método para dar de alta un duenio
    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    //método para borrar un duenio
    @Override
    public void deleteDuenio(Long id) {
        duenioRepository.deleteById(id);
    }

    //método para encontrar un duenio
    @Override
    public Duenio findDuenio(Long id) {
        //aquí si no encuentro el dueño, devuelvo null por eso va el orElse
        return duenioRepository.findById(id).orElse(null);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }

}
