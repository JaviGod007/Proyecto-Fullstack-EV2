package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReservaHabService}.
 */
@Generated
public class ReservaHabService__BeanDefinitions {
  /**
   * Get the bean definition for 'reservaHabService'.
   */
  public static BeanDefinition getReservaHabServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReservaHabService.class);
    InstanceSupplier<ReservaHabService> instanceSupplier = InstanceSupplier.using(ReservaHabService::new);
    instanceSupplier = instanceSupplier.andThen(ReservaHabService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
