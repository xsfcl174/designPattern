package com.fancl.build;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * <p>
 * 指挥者
 */
public class ActorController {

    public Actor build(ActorBuilder builder) {
        builder.buildName();
        builder.buildType();
        return builder.getResult();
    }
}
