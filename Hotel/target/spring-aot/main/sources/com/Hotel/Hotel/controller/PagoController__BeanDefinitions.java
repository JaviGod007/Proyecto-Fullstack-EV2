package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PagoController}.
 */
@Generated
public class PagoController__BeanDefinitions {
  /**
   * Get the bean definition for 'pagoController'.
   */
  public static BeanDefinition getPagoControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PagoController.class);
    InstanceSupplier<PagoController> instanceSupplier = InstanceSupplier.using(PagoController::new);
    instanceSupplier = instanceSupplier.andThen(PagoController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
