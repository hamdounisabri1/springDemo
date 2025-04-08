package tn.esprit.springprod.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Universite;
import tn.esprit.springprod.services.UniversiteService;

import java.util.List;

@RestController
@RequestMapping("universite")
public class UniversiteController {

    @Autowired
    UniversiteService universiteService;

    // ✅ Get all universities
    @GetMapping("/getAll")
    public List<Universite> getAllUniversities() {
        return universiteService.retrieveAllUniversities();
    }

    // ✅ Get a university by ID
    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable("id") long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }

    @PostMapping("/add")
    public Universite addUniversity(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/update")
    public Universite updateUniversity(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @PutMapping("affectFoyer/{nomUni}/{idFoyer}")
    public Universite affectFoyer(@PathVariable String nomUni, @PathVariable Long idFoyer) {
      return universiteService.affecterFoyerAUniversite(idFoyer, nomUni);
    }

    @PutMapping("desaffectFoyer/{idUni}")
    public Universite desaffectFoyer(@PathVariable Long idUni) {
        return universiteService.desaffecterFoyerAUniversite(idUni);
    }

}
