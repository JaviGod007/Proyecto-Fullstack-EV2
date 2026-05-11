package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TipoHabitacionController}.
 */
@Generated
public class TipoHabitacionController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TipoHabitacionController apply(RegisteredBean registeredBean,
      TipoHabitacionController instance) {
    AutowiredFieldValueResolver.forRequiredField("tipoHabitacionService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
