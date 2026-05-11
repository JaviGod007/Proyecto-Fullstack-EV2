package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabitacionController}.
 */
@Generated
public class HabitacionController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabitacionController apply(RegisteredBean registeredBean,
      HabitacionController instance) {
    instance.habitacionService = AutowiredFieldValueResolver.forRequiredField("habitacionService").resolve(registeredBean);
    return instance;
  }
}
