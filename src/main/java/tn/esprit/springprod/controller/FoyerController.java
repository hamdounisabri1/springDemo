package tn.esprit.springprod.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Foyer;
import tn.esprit.springprod.services.FoyerService;

import java.util.List;

@RestController
@RequestMapping("foyer")
public class FoyerController {
    @Autowired
    FoyerService foyerService;
    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable("id") Long id) {
        return foyerService.retrieveFoyer(id);
    }

    @GetMapping("/getAll")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFoyer(@PathVariable("id") Long id) {
        foyerService.removeFoyer(id);
        return ResponseEntity.ok("Deleted foyer with id " + id);
    }

    @PostMapping("/add/{id}")
    public Foyer addFoyer(@PathVariable("id") Long id, @RequestBody Foyer foyer) {
        foyerService.ajouterFoyerEtAffecterAUniversite(foyer,id);
        return null;
    }

}
