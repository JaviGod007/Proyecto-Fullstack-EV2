package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Habitacion;
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
 * AOT generated JPA repository implementation for {@link HabitacionRepository}.
 */
@Generated
public class HabitacionRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public HabitacionRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link HabitacionRepository#findByEstado(java.lang.String)}.
   */
  public List<Habitacion> findByEstado(String estado) {
    String queryString = "SELECT h FROM Habitacion h WHERE h.estado = :estado";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("estado", estado);

    return (List<Habitacion>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link HabitacionRepository#findByHotel_IdHotel(java.lang.Integer)}.
   */
  public List<Habitacion> findByHotel_IdHotel(Integer idHotel) {
    String queryString = "SELECT h FROM Habitacion h WHERE h.hotel.idHotel = :idHotel";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("idHotel", idHotel);

    return (List<Habitacion>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link HabitacionRepository#findByNumero(java.lang.Integer)}.
   */
  public Habitacion findByNumero(Integer numero) {
    String queryString = "SELECT h FROM Habitacion h WHERE h.numero = :numero";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("numero", numero);

    return (Habitacion) convertOne(query.getSingleResultOrNull(), false, Habitacion.class);
  }
}
