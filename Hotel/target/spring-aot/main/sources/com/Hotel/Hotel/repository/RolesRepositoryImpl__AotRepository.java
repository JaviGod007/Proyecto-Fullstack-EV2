package com.Hotel.Hotel.repository;

import com.Hotel.Hotel.model.Roles;
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
 * AOT generated JPA repository implementation for {@link RolesRepository}.
 */
@Generated
public class RolesRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public RolesRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link RolesRepository#findByIdroles(java.lang.Integer)}.
   */
  public List<Roles> findByIdroles(Integer id_roles) {
    String queryString = "SELECT r FROM Roles r WHERE r.idroles = :id_roles";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("id_roles", id_roles);

    return (List<Roles>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link RolesRepository#findByNombre(java.lang.String)}.
   */
  public List<Roles> findByNombre(String nombre) {
    String queryString = "SELECT r FROM Roles r WHERE r.nombre = :nombre";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("nombre", nombre);

    return (List<Roles>) query.getResultList();
  }
}
