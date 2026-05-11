package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PagoController}.
 */
@Generated
public class PagoController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PagoController apply(RegisteredBean registeredBean, PagoController instance) {
    instance.pagoService = AutowiredFieldValueResolver.forRequiredField("pagoService").resolve(registeredBean);
    return instance;
  }
}
