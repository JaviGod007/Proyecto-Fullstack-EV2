package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HotelService}.
 */
@Generated
public class HotelService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HotelService apply(RegisteredBean registeredBean, HotelService instance) {
    AutowiredFieldValueResolver.forRequiredField("hotelRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
