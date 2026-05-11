package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PagoService}.
 */
@Generated
public class PagoService__BeanDefinitions {
  /**
   * Get the bean definition for 'pagoService'.
   */
  public static BeanDefinition getPagoServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PagoService.class);
    InstanceSupplier<PagoService> instanceSupplier = InstanceSupplier.using(PagoService::new);
    instanceSupplier = instanceSupplier.andThen(PagoService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
