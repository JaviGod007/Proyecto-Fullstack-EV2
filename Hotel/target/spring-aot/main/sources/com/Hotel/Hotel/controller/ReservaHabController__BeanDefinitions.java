package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReservaHabController}.
 */
@Generated
public class ReservaHabController__BeanDefinitions {
  /**
   * Get the bean definition for 'reservaHabController'.
   */
  public static BeanDefinition getReservaHabControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReservaHabController.class);
    InstanceSupplier<ReservaHabController> instanceSupplier = InstanceSupplier.using(ReservaHabController::new);
    instanceSupplier = instanceSupplier.andThen(ReservaHabController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
