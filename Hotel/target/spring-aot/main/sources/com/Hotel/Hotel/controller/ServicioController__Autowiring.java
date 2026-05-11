package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ServicioController}.
 */
@Generated
public class ServicioController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ServicioController apply(RegisteredBean registeredBean,
      ServicioController instance) {
    instance.servicioService = AutowiredFieldValueResolver.forRequiredField("servicioService").resolve(registeredBean);
    return instance;
  }
}
