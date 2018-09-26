package com.fancl.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者 fanchengliang
 * 日期 2017/10/18
 * 项目 design-pattern
 * <p>
 * Factory Method Pattern
 */
public class FactoryMethod {
    private static Map<String, IPictureFactory> factoryMap = new HashMap<String, IPictureFactory>();

    static {
        regFactory(new GifPictureFactory());
        regFactory(new CommonPictureFactory());

    }

    public static void regFactory(IPictureFactory factory) {
        String[] supportType = factory.getSupportType();
        if (supportType != null) {
            StringBuilder errorMsg = new StringBuilder();
            for (String sType : supportType) {
                if (sType == null || sType.trim().length() == 0) continue;
                sType = sType.toLowerCase();
                if (factoryMap.containsKey(sType)) {
                    errorMsg.append(String.format("类型为 %s 的工厂已经被注册;", sType));
                } else {
                    factoryMap.put(sType, factory);
                }
            }
            if (errorMsg.length() > 0) {
                throw new RuntimeException(errorMsg.toString());
            }
        }
    }

    public static IPictureFactory getFactory(String type) {
        if (type == null)
            return null;
        return factoryMap.get(type.toLowerCase());
    }


}
