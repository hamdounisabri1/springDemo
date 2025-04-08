package tn.esprit.springprod.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprod.entities.Bloc;
import tn.esprit.springprod.entities.Chambre;
import tn.esprit.springprod.repositories.IBlockRepository;
import tn.esprit.springprod.repositories.IChambreRepository;

import java.util.List;

@Service
public class BlockService implements IBlockService {

    @Autowired
    IBlockRepository blockRepository;
    @Autowired
    IChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blockRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blockRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blockRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blockRepository.findById(idBloc).orElseThrow(() -> new EntityNotFoundException("Bloc not found "));
    }

    @Override
    public void removeBloc(long idBloc) {
            blockRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
            Bloc bloc = retrieveBloc(idBloc);
            for(Long num : numChambre) {
                Chambre chambre=chambreRepository.findChambreByNumeroChambre(num);
                chambre.setBloc(bloc);
                chambreRepository.save(chambre);
            }
        return bloc;
    }


}
