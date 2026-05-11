package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.TipoHabitacion;
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
 * AOT generated JPA repository implementation for {@link TipoHabitacionRepository}.
 */
@Generated
public class TipoHabitacionRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public TipoHabitacionRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link TipoHabitacionRepository#findByNombre(java.lang.String)}.
   */
  public List<TipoHabitacion> findByNombre(String nombre) {
    String queryString = "SELECT t FROM TipoHabitacion t WHERE t.nombre = :nombre";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", nombre);

    return (List<TipoHabitacion>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link TipoHabitacionRepository#findByNombreContainingIgnoreCase(java.lang.String)}.
   */
  public List<TipoHabitacion> findByNombreContainingIgnoreCase(String nombre) {
    String queryString = "SELECT t FROM TipoHabitacion t WHERE UPPER(t.nombre) LIKE UPPER(:nombre) ESCAPE '\\'";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", "%%%s%%".formatted(nombre != null ? nombre.toUpperCase() : nombre));

    return (List<TipoHabitacion>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link TipoHabitacionRepository#findByPrecio(java.lang.Integer)}.
   */
  public List<TipoHabitacion> findByPrecio(Integer precio) {
    String queryString = "SELECT t FROM TipoHabitacion t WHERE t.precio = :precio";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("precio", precio);

    return (List<TipoHabitacion>) query.getResultList();
  }
}
