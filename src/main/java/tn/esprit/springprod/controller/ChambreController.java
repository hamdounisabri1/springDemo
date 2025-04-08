package tn.esprit.springprod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Chambre;
import tn.esprit.springprod.services.ChambreService;

import java.util.List;

@RestController
@RequestMapping("chambre")

public class ChambreController {
    @Autowired
    ChambreService chambreService;

    @GetMapping("/get/{id}")
    public Chambre getChambreById(@PathVariable("id") Long id) {
        return chambreService.retrieveChambre(id);
    }

    @GetMapping("/getAll")
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        System.out.println(chambre.getIdChambre());
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }
}
