package fiap.challenge.sprin3.repositories;

import fiap.challenge.sprin3.entities._BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class _BaseRepositoryImpl<T extends _BaseEntity> implements _IBaseRepository<T> {

    protected List<T> entities = new ArrayList<>();
    @Override
    public void Create(T entity) {
        entities.add(entity);
    }

    @Override
    public List<T> ReadAll() {
        return entities;
    }

    @Override
    public void Update(T entity) {
        entities.removeIf(item -> item.getId() == entity.getId());
        entities.add(entity);
    }

    @Override
    public void Delete(T entity) {
        entities.removeIf(item -> item.getId() == entity.getId());
        entities.add(entity);
    }

    @Override
    public void DeleteById(int id) {
        entities.removeIf(item -> item.getId() == id);
    }
}

