package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Hotel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link HotelRepository}.
 */
@Generated
public class HotelRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public HotelRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link HotelRepository#findByDireccion(java.lang.String)}.
   */
  public List<Hotel> findByDireccion(String direccion) {
    String queryString = "SELECT h FROM Hotel h WHERE h.direccion = :direccion";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("direccion", direccion);

    return (List<Hotel>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link HotelRepository#findByNombre(java.lang.String)}.
   */
  public List<Hotel> findByNombre(String nombre) {
    String queryString = "SELECT h FROM Hotel h WHERE h.nombre = :nombre";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", nombre);

    return (List<Hotel>) query.getResultList();
  }
}
