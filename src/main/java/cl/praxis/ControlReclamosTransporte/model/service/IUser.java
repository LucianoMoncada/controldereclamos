package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entity.Usuarios;

import java.util.List;

public interface IUser {
    List<Usuarios> findAll();
    Usuarios findOne(int id);
    boolean create(Usuarios u);
    boolean update(Usuarios u);
    boolean delete(int id);

}
