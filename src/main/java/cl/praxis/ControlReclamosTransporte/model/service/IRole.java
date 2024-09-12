package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entity.Roles;

import java.util.List;

public interface IRole {

    List<Roles> findAll();
    Roles findOne(int id);
    boolean create(Roles r);
    boolean update(Roles r);
    boolean delete(int id);
}
