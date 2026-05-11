package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RolesController}.
 */
@Generated
public class RolesController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RolesController apply(RegisteredBean registeredBean, RolesController instance) {
    instance.rolesService = AutowiredFieldValueResolver.forRequiredField("rolesService").resolve(registeredBean);
    return instance;
  }
}
