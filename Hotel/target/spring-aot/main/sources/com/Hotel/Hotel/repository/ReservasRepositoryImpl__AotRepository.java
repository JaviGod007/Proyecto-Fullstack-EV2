package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Reservas;
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
 * AOT generated JPA repository implementation for {@link ReservasRepository}.
 */
@Generated
public class ReservasRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ReservasRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ReservasRepository#findByEstado(java.lang.String)}.
   */
  public List<Reservas> findByEstado(String estado) {
    String queryString = "SELECT r FROM Reservas r WHERE r.estado = :estado";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("estado", estado);

    return (List<Reservas>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link ReservasRepository#findByIdReserva(java.lang.Integer)}.
   */
  public List<Reservas> findByIdReserva(Integer idReserva) {
    String queryString = "SELECT r FROM Reservas r WHERE r.idReserva = :idReserva";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idReserva", idReserva);

    return (List<Reservas>) query.getResultList();
  }
}
