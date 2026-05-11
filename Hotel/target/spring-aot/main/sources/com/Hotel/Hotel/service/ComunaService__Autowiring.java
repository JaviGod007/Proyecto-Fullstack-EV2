package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ComunaService}.
 */
@Generated
public class ComunaService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ComunaService apply(RegisteredBean registeredBean, ComunaService instance) {
    instance.comunaRepository = AutowiredFieldValueResolver.forRequiredField("comunaRepository").resolve(registeredBean);
    return instance;
  }
}
