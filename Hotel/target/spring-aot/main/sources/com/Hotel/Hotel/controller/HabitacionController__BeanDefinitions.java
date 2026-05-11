package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabitacionController}.
 */
@Generated
public class HabitacionController__BeanDefinitions {
  /**
   * Get the bean definition for 'habitacionController'.
   */
  public static BeanDefinition getHabitacionControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HabitacionController.class);
    InstanceSupplier<HabitacionController> instanceSupplier = InstanceSupplier.using(HabitacionController::new);
    instanceSupplier = instanceSupplier.andThen(HabitacionController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
