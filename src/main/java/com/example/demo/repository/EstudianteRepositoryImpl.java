package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Estudiante;

import aj.org.objectweb.asm.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

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


	@Override
	public Estudiante buscarPorCedula(String cedula) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.cedula=:datoCedula", 
				Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);
		
		return myQuery.getSingleResult();
	}

}
