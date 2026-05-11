package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabitacionServicioController}.
 */
@Generated
public class HabitacionServicioController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabitacionServicioController apply(RegisteredBean registeredBean,
      HabitacionServicioController instance) {
    instance.habitacionServicioService = AutowiredFieldValueResolver.forRequiredField("habitacionServicioService").resolve(registeredBean);
    return instance;
  }
}
