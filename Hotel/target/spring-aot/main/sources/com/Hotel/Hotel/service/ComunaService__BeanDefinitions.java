package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ComunaService}.
 */
@Generated
public class ComunaService__BeanDefinitions {
  /**
   * Get the bean definition for 'comunaService'.
   */
  public static BeanDefinition getComunaServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComunaService.class);
    InstanceSupplier<ComunaService> instanceSupplier = InstanceSupplier.using(ComunaService::new);
    instanceSupplier = instanceSupplier.andThen(ComunaService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
