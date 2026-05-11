package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabitacionServicioController}.
 */
@Generated
public class HabitacionServicioController__BeanDefinitions {
  /**
   * Get the bean definition for 'habitacionServicioController'.
   */
  public static BeanDefinition getHabitacionServicioControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HabitacionServicioController.class);
    InstanceSupplier<HabitacionServicioController> instanceSupplier = InstanceSupplier.using(HabitacionServicioController::new);
    instanceSupplier = instanceSupplier.andThen(HabitacionServicioController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
