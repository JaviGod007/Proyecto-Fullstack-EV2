package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabitacionService}.
 */
@Generated
public class HabitacionService__BeanDefinitions {
  /**
   * Get the bean definition for 'habitacionService'.
   */
  public static BeanDefinition getHabitacionServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HabitacionService.class);
    InstanceSupplier<HabitacionService> instanceSupplier = InstanceSupplier.using(HabitacionService::new);
    instanceSupplier = instanceSupplier.andThen(HabitacionService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
