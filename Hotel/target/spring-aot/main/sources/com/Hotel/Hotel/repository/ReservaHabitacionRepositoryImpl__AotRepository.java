package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.ReservaHabitacion;
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
 * AOT generated JPA repository implementation for {@link ReservaHabitacionRepository}.
 */
@Generated
public class ReservaHabitacionRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ReservaHabitacionRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ReservaHabitacionRepository#findByHabitacionIdHabitacion(java.lang.Integer)}.
   */
  public List<ReservaHabitacion> findByHabitacionIdHabitacion(Integer idHabitacion) {
    String queryString = "SELECT r FROM ReservaHabitacion r WHERE r.habitacion.idHabitacion = :idHabitacion";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idHabitacion", idHabitacion);

    return (List<ReservaHabitacion>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ReservaHabitacionRepository#findByPrecioNoche(java.lang.Integer)}.
   */
  public List<ReservaHabitacion> findByPrecioNoche(Integer precioNoche) {
    String queryString = "SELECT r FROM ReservaHabitacion r WHERE r.precioNoche = :precioNoche";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("precioNoche", precioNoche);

    return (List<ReservaHabitacion>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ReservaHabitacionRepository#findByReserva_IdReserva(java.lang.Integer)}.
   */
  public List<ReservaHabitacion> findByReserva_IdReserva(Integer idReserva) {
    String queryString = "SELECT r FROM ReservaHabitacion r WHERE r.reserva.idReserva = :idReserva";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idReserva", idReserva);

    return (List<ReservaHabitacion>) query.getResultList();
  }
}
