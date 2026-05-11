package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabitacionServicioService}.
 */
@Generated
public class HabitacionServicioService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabitacionServicioService apply(RegisteredBean registeredBean,
      HabitacionServicioService instance) {
    instance.habitacionServicioRepository = AutowiredFieldValueResolver.forRequiredField("habitacionServicioRepository").resolve(registeredBean);
    return instance;
  }
}
