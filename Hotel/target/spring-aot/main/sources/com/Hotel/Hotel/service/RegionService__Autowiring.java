package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RegionService}.
 */
@Generated
public class RegionService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RegionService apply(RegisteredBean registeredBean, RegionService instance) {
    instance.regionRepository = AutowiredFieldValueResolver.forRequiredField("regionRepository").resolve(registeredBean);
    return instance;
  }
}
