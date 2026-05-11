package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TipoHabitacionService}.
 */
@Generated
public class TipoHabitacionService__BeanDefinitions {
  /**
   * Get the bean definition for 'tipoHabitacionService'.
   */
  public static BeanDefinition getTipoHabitacionServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TipoHabitacionService.class);
    InstanceSupplier<TipoHabitacionService> instanceSupplier = InstanceSupplier.using(TipoHabitacionService::new);
    instanceSupplier = instanceSupplier.andThen(TipoHabitacionService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
