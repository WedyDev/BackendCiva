package pe.civa.civatecnica.services;

import pe.civa.civatecnica.entities.Users;

import java.util.List;

public interface IUsersService {
    public void insert(Users users);
    public List<Users>listar();
    public void delete(Long id);
    public Users listarId(Long id);
    List<String[]> cantidad_usuarios_bygenero();

}
