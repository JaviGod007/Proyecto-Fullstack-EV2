package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServicioController}.
 */
@Generated
public class ServicioController__BeanDefinitions {
  /**
   * Get the bean definition for 'servicioController'.
   */
  public static BeanDefinition getServicioControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServicioController.class);
    InstanceSupplier<ServicioController> instanceSupplier = InstanceSupplier.using(ServicioController::new);
    instanceSupplier = instanceSupplier.andThen(ServicioController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
