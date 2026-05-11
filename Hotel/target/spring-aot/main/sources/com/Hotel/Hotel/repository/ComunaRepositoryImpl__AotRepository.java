package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Comuna;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link ComunaRepository}.
 */
@Generated
public class ComunaRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ComunaRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ComunaRepository#findByNombre(java.lang.String)}.
   */
  public List<Comuna> findByNombre(String nombre) {
    String queryString = "SELECT c FROM Comuna c WHERE c.nombre = :nombre";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", nombre);

    return (List<Comuna>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ComunaRepository#findByNombreContainingIgnoreCase(java.lang.String)}.
   */
  public List<Comuna> findByNombreContainingIgnoreCase(String nombre) {
    String queryString = "SELECT c FROM Comuna c WHERE UPPER(c.nombre) LIKE UPPER(:nombre) ESCAPE '\\'";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", "%%%s%%".formatted(nombre != null ? nombre.toUpperCase() : nombre));

    return (List<Comuna>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ComunaRepository#findByRegion_IdRegion(java.lang.Integer)}.
   */
  public List<Comuna> findByRegion_IdRegion(Integer idRegion) {
    String queryString = "SELECT c FROM Comuna c WHERE c.region.idRegion = :idRegion";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idRegion", idRegion);

    return (List<Comuna>) query.getResultList();
  }
}
