package pe.civa.civatecnica.services;


import org.springframework.data.repository.query.Param;
import pe.civa.civatecnica.entities.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> listar();
    public Role listarId(long idRole);
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);

    public void updRol(@Param("rol") String authority, @Param("user_id") Long user_id);

    public void delRol(@Param("user_id") Long user_id);

    public void insRolLog();


}
