package pe.civa.civatecnica.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.civa.civatecnica.entities.Role;
import pe.civa.civatecnica.repositories.RoleRepository;
import pe.civa.civatecnica.services.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    public RoleRepository rR;
    @Override
    public List<Role> listar() {
        return rR.findAll();
    }

    @Override
    public Role listarId(long idRole) {
        return rR.findById(idRole).orElse(new Role());
    }

    @Override
    public void insRol(String authority, Long user_id) {
        rR.insRol(authority,user_id);
    }

    @Override
    public void updRol(String authority, Long user_id) {
        rR.updRol(authority,user_id);
    }

    @Override
    public void delRol(Long user_id) {
        rR.delRol(user_id);
    }

    @Override
    public void insRolLog() {
        rR.insRolLog();
    }
}
