package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReservasController}.
 */
@Generated
public class ReservasController__BeanDefinitions {
  /**
   * Get the bean definition for 'reservasController'.
   */
  public static BeanDefinition getReservasControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReservasController.class);
    InstanceSupplier<ReservasController> instanceSupplier = InstanceSupplier.using(ReservasController::new);
    instanceSupplier = instanceSupplier.andThen(ReservasController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
