package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link RegionRepository}.
 */
@Generated
public class RegionRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public RegionRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link RegionRepository#findAllByOrderByNombreAsc()}.
   */
  public List<Region> findAllByOrderByNombreAsc() {
    String queryString = "SELECT r FROM Region r ORDER BY r.nombre asc";
    Query query = this.entityManager.createQuery(queryString);

    return (List<Region>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link RegionRepository#findByNombre(java.lang.String)}.
   */
  public List<Region> findByNombre(String nombre) {
    String queryString = "SELECT r FROM Region r WHERE r.nombre = :nombre";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", nombre);

    return (List<Region>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link RegionRepository#findByNombreContainingIgnoreCase(java.lang.String)}.
   */
  public List<Region> findByNombreContainingIgnoreCase(String nombre) {
    String queryString = "SELECT r FROM Region r WHERE UPPER(r.nombre) LIKE UPPER(:nombre) ESCAPE '\\'";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", "%%%s%%".formatted(nombre != null ? nombre.toUpperCase() : nombre));

    return (List<Region>) query.getResultList();
  }
}
