package tn.esprit.springprod.services;

import tn.esprit.springprod.entities.Bloc;

import java.util.List;

public interface IBlockService {

    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);

}
