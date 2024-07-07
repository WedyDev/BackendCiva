package pe.civa.civatecnica.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.civa.civatecnica.entities.futbolistas;
import pe.civa.civatecnica.services.IFutbolistaServices;
import pe.civa.civatecnica.repositories.Ifutbolitas;

import java.util.List;

@Service
public class FutbolistaServiceImplement implements IFutbolistaServices {
    @Autowired
    private Ifutbolitas ftb;

    @Override
    public List<futbolistas> list() {
        return ftb.findAll();
    }

    @Override
    public futbolistas listId(int idComentario) {
        return ftb.findById(idComentario).orElse(new futbolistas());
    }
}
