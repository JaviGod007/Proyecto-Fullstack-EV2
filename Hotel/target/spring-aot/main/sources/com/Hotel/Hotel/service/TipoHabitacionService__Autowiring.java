package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TipoHabitacionService}.
 */
@Generated
public class TipoHabitacionService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TipoHabitacionService apply(RegisteredBean registeredBean,
      TipoHabitacionService instance) {
    AutowiredFieldValueResolver.forRequiredField("tipoHabitacionRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
