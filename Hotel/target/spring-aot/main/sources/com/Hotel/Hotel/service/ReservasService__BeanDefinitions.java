package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReservasService}.
 */
@Generated
public class ReservasService__BeanDefinitions {
  /**
   * Get the bean definition for 'reservasService'.
   */
  public static BeanDefinition getReservasServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReservasService.class);
    InstanceSupplier<ReservasService> instanceSupplier = InstanceSupplier.using(ReservasService::new);
    instanceSupplier = instanceSupplier.andThen(ReservasService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
