package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Servicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link ServicioRepository}.
 */
@Generated
public class ServicioRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ServicioRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ServicioRepository#findByNombre(java.lang.String)}.
   */
  public List<Servicio> findByNombre(String nombre) {
    String queryString = "SELECT s FROM Servicio s WHERE s.nombre = :nombre";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", nombre);

    return (List<Servicio>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ServicioRepository#findByNombreContainingIgnoreCase(java.lang.String)}.
   */
  public List<Servicio> findByNombreContainingIgnoreCase(String nombre) {
    String queryString = "SELECT s FROM Servicio s WHERE UPPER(s.nombre) LIKE UPPER(:nombre) ESCAPE '\\'";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", "%%%s%%".formatted(nombre != null ? nombre.toUpperCase() : nombre));

    return (List<Servicio>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ServicioRepository#findByPrecioBetween(java.lang.Double,java.lang.Double)}.
   */
  public List<Servicio> findByPrecioBetween(Double precioMin, Double precioMax) {
    String queryString = "SELECT s FROM Servicio s WHERE s.precio BETWEEN :precioMin AND :precioMax";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("precioMin", precioMin);
    query.setParameter("precioMax", precioMax);

    return (List<Servicio>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ServicioRepository#findByPrecioLessThanEqual(java.lang.Double)}.
   */
  public List<Servicio> findByPrecioLessThanEqual(Double precio) {
    String queryString = "SELECT s FROM Servicio s WHERE s.precio <= :precio";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("precio", precio);

    return (List<Servicio>) query.getResultList();
  }
}
