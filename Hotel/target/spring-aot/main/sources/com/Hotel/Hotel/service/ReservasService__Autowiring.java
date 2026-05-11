package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReservasService}.
 */
@Generated
public class ReservasService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReservasService apply(RegisteredBean registeredBean, ReservasService instance) {
    instance.reservasRepository = AutowiredFieldValueResolver.forRequiredField("reservasRepository").resolve(registeredBean);
    return instance;
  }
}
