package com.fancl.build;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    void buildName() {
        actor.setName("Angel001");
    }

    @Override
    void buildType() {
        actor.setType("Angel");
    }
}
