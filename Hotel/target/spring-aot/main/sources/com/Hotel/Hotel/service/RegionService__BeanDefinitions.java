package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RegionService}.
 */
@Generated
public class RegionService__BeanDefinitions {
  /**
   * Get the bean definition for 'regionService'.
   */
  public static BeanDefinition getRegionServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegionService.class);
    InstanceSupplier<RegionService> instanceSupplier = InstanceSupplier.using(RegionService::new);
    instanceSupplier = instanceSupplier.andThen(RegionService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
