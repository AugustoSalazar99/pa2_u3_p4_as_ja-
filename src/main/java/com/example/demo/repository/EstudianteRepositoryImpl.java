package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Estudiante estudiante) {
        this.entityManager.persist(estudiante);

    }

 
    @Override
    public void actualizar(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }

 

    @Override
    public void eliminar(Integer id) {
        Estudiante estu = this.buscar(id);
        this.entityManager.remove(estu);
    }

 

    @Override
    public Estudiante buscar(Integer id) {

        return  this.entityManager.find(Estudiante.class, id);
    }

}
