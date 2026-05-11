package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReservaHabController}.
 */
@Generated
public class ReservaHabController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReservaHabController apply(RegisteredBean registeredBean,
      ReservaHabController instance) {
    instance.reservaHabService = AutowiredFieldValueResolver.forRequiredField("reservaHabService").resolve(registeredBean);
    return instance;
  }
}
