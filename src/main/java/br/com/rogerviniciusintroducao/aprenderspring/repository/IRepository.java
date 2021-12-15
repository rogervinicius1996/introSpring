package br.com.rogerviniciusintroducao.aprenderspring.repository;
import java.util.List;
import java.util.Optional;

public interface IRepository<E> {
    public boolean insert(E entity);
    public boolean update(E entity);
    public Optional<E> findById(int id);
    public List<E> findAll();
    public boolean delete(int id);

}
