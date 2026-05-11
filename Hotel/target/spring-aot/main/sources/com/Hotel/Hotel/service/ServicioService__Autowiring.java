package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ServicioService}.
 */
@Generated
public class ServicioService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ServicioService apply(RegisteredBean registeredBean, ServicioService instance) {
    instance.servicioRepository = AutowiredFieldValueResolver.forRequiredField("servicioRepository").resolve(registeredBean);
    return instance;
  }
}
