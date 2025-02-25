package tn.esprit.springprod.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprod.entities.Bloc;
import tn.esprit.springprod.repositories.IBlockRepository;

import java.util.List;

@Service
public class BlockService implements IBlockService {

    @Autowired
    IBlockRepository blockRepository;

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
}
