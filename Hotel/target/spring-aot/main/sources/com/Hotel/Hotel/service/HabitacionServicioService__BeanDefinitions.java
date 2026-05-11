package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabitacionServicioService}.
 */
@Generated
public class HabitacionServicioService__BeanDefinitions {
  /**
   * Get the bean definition for 'habitacionServicioService'.
   */
  public static BeanDefinition getHabitacionServicioServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HabitacionServicioService.class);
    InstanceSupplier<HabitacionServicioService> instanceSupplier = InstanceSupplier.using(HabitacionServicioService::new);
    instanceSupplier = instanceSupplier.andThen(HabitacionServicioService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
