package tn.esprit.springprod.services;

import tn.esprit.springprod.entities.Chambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);

}
