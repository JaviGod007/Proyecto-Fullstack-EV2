package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.HabitacionServicio;
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
 * AOT generated JPA repository implementation for {@link HabitacionServicioRepository}.
 */
@Generated
public class HabitacionServicioRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public HabitacionServicioRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link HabitacionServicioRepository#findByHabitacion_IdHabitacion(java.lang.Integer)}.
   */
  public List<HabitacionServicio> findByHabitacion_IdHabitacion(Integer idHabitacion) {
    String queryString = "SELECT h FROM HabitacionServicio h WHERE h.habitacion.idHabitacion = :idHabitacion";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idHabitacion", idHabitacion);

    return (List<HabitacionServicio>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link HabitacionServicioRepository#findByServicio_IdServicio(java.lang.Integer)}.
   */
  public List<HabitacionServicio> findByServicio_IdServicio(Integer idServicio) {
    String queryString = "SELECT h FROM HabitacionServicio h WHERE h.servicio.idServicio = :idServicio";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idServicio", idServicio);

    return (List<HabitacionServicio>) query.getResultList();
  }
}
