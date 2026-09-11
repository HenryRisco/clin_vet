package com.henryrisco.ClinicaVeterinariaFido.controller;

import com.henryrisco.ClinicaVeterinariaFido.model.Duenio;
import com.henryrisco.ClinicaVeterinariaFido.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService duenioServ;

    //Endpoint para obtener todos los duenios
    @GetMapping("/duenio/traer")
    public List<Duenio> getDuenios() {
        return duenioServ.getDuenios();
    }

    //Endpoint para crear una nuevo duenio
    @PostMapping("/duenio/crear")
    public String saveDuenio(@RequestBody Duenio duenio) {
        duenioServ.saveDuenio(duenio);
        return "El duenio fue creado correctamente";
    }

    //Endpoint para dar de baja un nuevo Duenio
    @DeleteMapping("/duenio/borrar/{id}")
    public String deleteDuenio(@PathVariable Long id) {
        duenioServ.deleteDuenio(id);
        return "El dueño fue eliminado correctamente";
    }

    //Endpoint para modificar un duenio
    @PutMapping ("/duenio/editar")
    public Duenio editDuenio(@RequestBody Duenio duenio) {
        duenioServ.editDuenio(duenio);

        return duenioServ.findDuenio(duenio.getId());
    }
}
