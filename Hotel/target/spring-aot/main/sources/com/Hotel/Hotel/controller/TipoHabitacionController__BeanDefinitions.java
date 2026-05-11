package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TipoHabitacionController}.
 */
@Generated
public class TipoHabitacionController__BeanDefinitions {
  /**
   * Get the bean definition for 'tipoHabitacionController'.
   */
  public static BeanDefinition getTipoHabitacionControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TipoHabitacionController.class);
    InstanceSupplier<TipoHabitacionController> instanceSupplier = InstanceSupplier.using(TipoHabitacionController::new);
    instanceSupplier = instanceSupplier.andThen(TipoHabitacionController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
