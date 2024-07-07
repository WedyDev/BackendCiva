package pe.civa.civatecnica.services;
import pe.civa.civatecnica.entities.futbolistas;

import java.util.List;

public interface IFutbolistaServices {
    List<futbolistas> list();
    public futbolistas listId(int idComentario);

}
