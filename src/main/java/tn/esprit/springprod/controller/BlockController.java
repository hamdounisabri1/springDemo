package tn.esprit.springprod.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Block;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprod.entities.Bloc;
import tn.esprit.springprod.services.IBlockService;

import java.util.List;

@RestController
@RequestMapping("block")
public class BlockController {

    @Autowired
    IBlockService blockService;


  @GetMapping("getAll")
  public List<Bloc> getBlock() {
      return blockService.retrieveBlocs();
  }

  @PostMapping("add")
    public Bloc addBlock(@RequestBody Bloc bloc) {
      return blockService.addBloc(bloc);
  }

}
