package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReservasController}.
 */
@Generated
public class ReservasController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReservasController apply(RegisteredBean registeredBean,
      ReservasController instance) {
    instance.reservasService = AutowiredFieldValueResolver.forRequiredField("reservasService").resolve(registeredBean);
    return instance;
  }
}
