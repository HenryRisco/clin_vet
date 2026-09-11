package com.henryrisco.ClinicaVeterinariaFido.controller;


import com.henryrisco.ClinicaVeterinariaFido.dto.MascotaDuenioDTO;
import com.henryrisco.ClinicaVeterinariaFido.model.Mascota;
import com.henryrisco.ClinicaVeterinariaFido.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    //Endpoint para obtener todos los duenios
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas() {
        return mascotaService.getMascotas();
    }

    //Endpoint para crear una nuevo duenio
    @PostMapping("/mascotas/crear")
    public String crearMascota(@RequestBody Mascota mascota) {
        mascotaService.saveMascota(mascota);
        return "La mascota fue creada correctamente";
    }

    //Endpoint para dar de baja un nuevo Duenio
    @DeleteMapping("/mascotas/borrar/{id}")
    public String deleteMascota(@PathVariable Long id) {
        mascotaService.deleteMascota(id);
        return "La mascota fue eliminado correctamente";
    }

    @PutMapping("/mascotas/editar")
    public String editMascota(@RequestBody Mascota mascota) {

        mascotaService.editMascota(mascota);
        return "La mascota fue borrada correctamente";
    }

    @GetMapping("/mascotas/traer-caniches")
    public List<Mascota> traerCaniches() {
        return mascotaService.getCaniches();
    }

    @GetMapping ("mascotas/traer-duenios")
    public List<MascotaDuenioDTO> traerMascoDuenios () {

        return mascotaService.getMascotaDuenio();

    }
}
