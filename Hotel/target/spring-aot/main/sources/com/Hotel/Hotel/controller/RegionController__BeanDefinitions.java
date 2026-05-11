package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RegionController}.
 */
@Generated
public class RegionController__BeanDefinitions {
  /**
   * Get the bean definition for 'regionController'.
   */
  public static BeanDefinition getRegionControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RegionController.class);
    InstanceSupplier<RegionController> instanceSupplier = InstanceSupplier.using(RegionController::new);
    instanceSupplier = instanceSupplier.andThen(RegionController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
