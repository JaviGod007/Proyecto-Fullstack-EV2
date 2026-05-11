package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PagoService}.
 */
@Generated
public class PagoService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PagoService apply(RegisteredBean registeredBean, PagoService instance) {
    instance.pagoRepository = AutowiredFieldValueResolver.forRequiredField("pagoRepository").resolve(registeredBean);
    return instance;
  }
}
