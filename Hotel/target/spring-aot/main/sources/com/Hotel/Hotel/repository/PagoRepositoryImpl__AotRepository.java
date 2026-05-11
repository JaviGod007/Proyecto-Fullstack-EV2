package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Pago;
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
 * AOT generated JPA repository implementation for {@link PagoRepository}.
 */
@Generated
public class PagoRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public PagoRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link PagoRepository#findByMetodo(java.lang.String)}.
   */
  public List<Pago> findByMetodo(String metodo) {
    String queryString = "SELECT p FROM Pago p WHERE p.metodo = :metodo";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("metodo", metodo);

    return (List<Pago>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link PagoRepository#findByReserva_IdReserva(java.lang.Integer)}.
   */
  public List<Pago> findByReserva_IdReserva(Integer idReserva) {
    String queryString = "SELECT p FROM Pago p WHERE p.reserva.idReserva = :idReserva";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idReserva", idReserva);

    return (List<Pago>) query.getResultList();
  }
}
