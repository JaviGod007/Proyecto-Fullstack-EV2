package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RegionController}.
 */
@Generated
public class RegionController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RegionController apply(RegisteredBean registeredBean, RegionController instance) {
    instance.regionService = AutowiredFieldValueResolver.forRequiredField("regionService").resolve(registeredBean);
    return instance;
  }
}
