package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabitacionService}.
 */
@Generated
public class HabitacionService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabitacionService apply(RegisteredBean registeredBean, HabitacionService instance) {
    instance.habitacionRepository = AutowiredFieldValueResolver.forRequiredField("habitacionRepository").resolve(registeredBean);
    return instance;
  }
}
