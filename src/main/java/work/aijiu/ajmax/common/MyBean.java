package work.aijiu.ajmax.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: aijiu
 * @version: 1.0
 * @description: 作用
 * @createDate: 2022/6/7 16:47
 * @updateUser: aijiu
 * @updateDate: 2022/6/7 16:47
 **/
@Component
public class MyBean {

    @Value("${name}")
    private String name;
}
