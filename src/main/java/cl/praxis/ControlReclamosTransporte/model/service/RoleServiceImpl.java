package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entity.Roles;
import cl.praxis.ControlReclamosTransporte.model.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements IRole {

    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Roles> findAll() {
        return repository.findAll();
    }

    @Override
    public Roles findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Roles r) {
        return repository.save(r) != null;
    }

    @Override
    public boolean update(Roles r) {
        return repository.save(r) != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}