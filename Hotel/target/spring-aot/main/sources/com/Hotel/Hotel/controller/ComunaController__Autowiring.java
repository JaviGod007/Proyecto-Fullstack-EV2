package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ComunaController}.
 */
@Generated
public class ComunaController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ComunaController apply(RegisteredBean registeredBean, ComunaController instance) {
    instance.comunaService = AutowiredFieldValueResolver.forRequiredField("comunaService").resolve(registeredBean);
    return instance;
  }
}
