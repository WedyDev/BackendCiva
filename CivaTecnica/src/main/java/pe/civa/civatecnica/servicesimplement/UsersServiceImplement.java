package pe.civa.civatecnica.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  pe.civa.civatecnica.entities.Users;
import  pe.civa.civatecnica.repositories.UserRepository;
import  pe.civa.civatecnica.services.IUsersService;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {
    @Autowired
    private UserRepository uR;
    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> listar() {
        return uR.findAll();
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public Users listarId(Long id) {
        return uR.findById(id).orElse(new Users());
    }


    @Override
    public List<String[]> cantidad_usuarios_bygenero() {
        return uR.cantidad_usuarios_bygenero();
    }
}
