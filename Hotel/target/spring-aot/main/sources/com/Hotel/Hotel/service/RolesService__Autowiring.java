package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RolesService}.
 */
@Generated
public class RolesService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RolesService apply(RegisteredBean registeredBean, RolesService instance) {
    instance.rolesRepository = AutowiredFieldValueResolver.forRequiredField("rolesRepository").resolve(registeredBean);
    return instance;
  }
}
