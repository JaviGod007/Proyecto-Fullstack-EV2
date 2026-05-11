package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReservaHabService}.
 */
@Generated
public class ReservaHabService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReservaHabService apply(RegisteredBean registeredBean, ReservaHabService instance) {
    instance.reservaHabRepository = AutowiredFieldValueResolver.forRequiredField("reservaHabRepository").resolve(registeredBean);
    return instance;
  }
}
