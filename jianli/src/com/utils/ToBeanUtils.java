package com.utils;
import java.util.Map;

public class ToBeanUtils {
    /**
     * 使用方法：
     *  User userNew = ToBeanUtils.copyParamToBean(req.getParameterMap(), new User());
     * 把Map中的值注入到对应的JavaBean属性中。
     * @param value
     * @param bean
     */
    public static <T> T copyParamToBean( Map value , T bean ){
        try {
            System.out.println("注入之前：" + bean);
            /**
             * 把所有请求的参数都注入到对象中
             */
            org.apache.commons.beanutils.BeanUtils.populate(bean, value);
            System.out.println("注入之后：" + bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

}
