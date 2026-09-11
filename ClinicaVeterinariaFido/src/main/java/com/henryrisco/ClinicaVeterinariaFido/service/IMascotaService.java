package com.henryrisco.ClinicaVeterinariaFido.service;

import com.henryrisco.ClinicaVeterinariaFido.dto.MascotaDuenioDTO;
import com.henryrisco.ClinicaVeterinariaFido.model.Mascota;

import java.util.List;

public interface IMascotaService {

    //método para traer todos los mascotas
    //lectura
    public  List<Mascota> getMascotas();

    //método para dar de alta
    public void saveMascota(Mascota mascota);

    //método para borrar
    public void deleteMascota(Long id);

    //método para encontrar
    public Mascota findMascota(Long id);

    //método para editar/modificar una Mascota
    public void editMascota(Mascota mascota);

    public List<Mascota> getCaniches();

    public List<MascotaDuenioDTO> getMascotaDuenio();
}
