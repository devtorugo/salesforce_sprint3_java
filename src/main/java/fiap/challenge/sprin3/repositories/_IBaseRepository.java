package fiap.challenge.sprin3.repositories;

import fiap.challenge.sprin3.entities._BaseEntity;

import java.util.List;

public interface _IBaseRepository <T extends _BaseEntity> {

    public void Create(T entity);
    public List<T> ReadAll();
    public void Update(T entity);
    public void Delete(T entity);
    public void DeleteById(int id);
}
