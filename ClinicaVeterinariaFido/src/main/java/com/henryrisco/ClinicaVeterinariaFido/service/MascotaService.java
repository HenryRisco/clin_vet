package com.henryrisco.ClinicaVeterinariaFido.service;

import com.henryrisco.ClinicaVeterinariaFido.dto.MascotaDuenioDTO;
import com.henryrisco.ClinicaVeterinariaFido.model.Mascota;
import com.henryrisco.ClinicaVeterinariaFido.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        //List<Mascota> listaMascotas = mascotaRepository.findAll();
        return mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota masco) {

        mascotaRepository.save(masco);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        //aquí si no encuentro la mascota, devuelvo null por eso va el orElse
        //Mascota mascota = mascotaRepository.findById(id).orElse(null);
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();


        for (Mascota masco:listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro")) {
                if (masco.getRaza().equalsIgnoreCase("caniche")) {
                    listaCaniches.add(masco);
                }
            }
        }
        //List<Mascota> listaCaniches2 = listaCaniches;
        return listaCaniches;

    }

    @Override
    public List<MascotaDuenioDTO> getMascotaDuenio() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<MascotaDuenioDTO> listaMascoDuenio = new ArrayList<MascotaDuenioDTO>();
        MascotaDuenioDTO masco_duenio = new MascotaDuenioDTO();

        for (Mascota masco : listaMascotas) {

            System.out.println(masco.getNombre());
            masco_duenio.setNombre_duenio(masco.getDuenio().getNombre());
            masco_duenio.setNombre_mascota(masco.getNombre());
            masco_duenio.setApellido_duenio(masco.getDuenio().getApellido());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());

            listaMascoDuenio.add(masco_duenio);
            masco_duenio = new MascotaDuenioDTO();//reseteo
        }
        return listaMascoDuenio;
    }
}
