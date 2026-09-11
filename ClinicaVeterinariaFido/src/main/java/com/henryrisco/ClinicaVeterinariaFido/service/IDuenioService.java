package com.henryrisco.ClinicaVeterinariaFido.service;

import com.henryrisco.ClinicaVeterinariaFido.model.Duenio;

import java.util.List;

public interface IDuenioService {

    //método para traer todos los duenios
    public List<Duenio> getDuenios();

    //método para dar de alta un duenio
    public void saveDuenio(Duenio duenio);

    //método para borrar un duenio
    public void deleteDuenio(Long id);

    //método para encontrar un duenio
    public Duenio findDuenio(Long id);

    //método para editar un duenio
    public void editDuenio(Duenio duenio);
}
