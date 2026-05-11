package com.Hotel.Hotel;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HotelApplication}.
 */
@Generated
public class HotelApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'hotelApplication'.
   */
  public static BeanDefinition getHotelApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HotelApplication.class);
    beanDefinition.setInstanceSupplier(HotelApplication::new);
    return beanDefinition;
  }
}
