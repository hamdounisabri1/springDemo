package tn.esprit.springprod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Etudiant;
import tn.esprit.springprod.services.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {

    @Autowired
     EtudiantService etudiantService;

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long id) {
        return etudiantService.retrieveEtudiant(id);
    }

    @GetMapping("/getAll")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/add")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantService.addEtudiants(etudiants);
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEtudiant(@PathVariable("id") Long id) {
        etudiantService.removeEtudiant(id);
        return ResponseEntity.ok("Deleted etudiant with id " + id);
    }

}
