package com.Hotel.Hotel.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RolesService}.
 */
@Generated
public class RolesService__BeanDefinitions {
  /**
   * Get the bean definition for 'rolesService'.
   */
  public static BeanDefinition getRolesServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RolesService.class);
    InstanceSupplier<RolesService> instanceSupplier = InstanceSupplier.using(RolesService::new);
    instanceSupplier = instanceSupplier.andThen(RolesService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
