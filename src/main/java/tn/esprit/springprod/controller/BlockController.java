package tn.esprit.springprod.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Block;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Bloc;
import tn.esprit.springprod.services.IBlockService;

import java.util.List;

@RestController
@RequestMapping("block")
public class BlockController {

    @Autowired
    IBlockService blockService;

    @GetMapping("get/{id}")
    public Bloc getEntrepriseById(@PathVariable("id") Long id) {
        return blockService.retrieveBloc(id);
    }
  @GetMapping("getAll")
  public List<Bloc> getBlock() {
      return blockService.retrieveBlocs();
  }

  @PostMapping("add")
    public Bloc addBlock(@RequestBody Bloc bloc) {
      return blockService.addBloc(bloc);
  }

  @PutMapping("update")
    public Bloc updateBlock(@RequestBody Bloc bloc) {
        return blockService.updateBloc(bloc);
  }

  @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteBlock(@PathVariable("id") Long id) {
        blockService.removeBloc(id);
       return ResponseEntity.ok("Deleted block with id " + id);
  }

    @PutMapping("/{idBloc}/affecter-chambres")
    public ResponseEntity<Bloc> affecterChambres(@PathVariable long idBloc, @RequestBody List<Long> numChambres) {
        Bloc updatedBloc = blockService.affecterChambresABloc(numChambres, idBloc);
        return ResponseEntity.ok(updatedBloc);
    }
}





