package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComunaController}.
 */
@Generated
public class ComunaController__BeanDefinitions {
  /**
   * Get the bean definition for 'comunaController'.
   */
  public static BeanDefinition getComunaControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComunaController.class);
    InstanceSupplier<ComunaController> instanceSupplier = InstanceSupplier.using(ComunaController::new);
    instanceSupplier = instanceSupplier.andThen(ComunaController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
