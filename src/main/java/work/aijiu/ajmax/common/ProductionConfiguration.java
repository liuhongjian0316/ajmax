package work.aijiu.ajmax.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author: aijiu
 * @version: 1.0
 * @description: 作用
 * @createDate: 2022/6/7 16:47
 * @updateUser: aijiu
 * @updateDate: 2022/6/7 16:47
 **/
@Configuration(proxyBeanMethods = false)
@Profile("production")
public class ProductionConfiguration {
}
