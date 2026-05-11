package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServicioService}.
 */
@Generated
public class ServicioService__BeanDefinitions {
  /**
   * Get the bean definition for 'servicioService'.
   */
  public static BeanDefinition getServicioServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServicioService.class);
    InstanceSupplier<ServicioService> instanceSupplier = InstanceSupplier.using(ServicioService::new);
    instanceSupplier = instanceSupplier.andThen(ServicioService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
