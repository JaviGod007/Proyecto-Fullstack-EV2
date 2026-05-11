package com.Hotel.Hotel.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RolesController}.
 */
@Generated
public class RolesController__BeanDefinitions {
  /**
   * Get the bean definition for 'rolesController'.
   */
  public static BeanDefinition getRolesControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RolesController.class);
    InstanceSupplier<RolesController> instanceSupplier = InstanceSupplier.using(RolesController::new);
    instanceSupplier = instanceSupplier.andThen(RolesController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
