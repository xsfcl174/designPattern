package com.fancl.build;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 *
 * 建造抽象类
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    abstract void buildName();

    abstract void buildType();

    public Actor getResult() {
        return actor;
    }

    /**
     * 理论上抽象的建造类可以在自己实现部件的装配的基础上，同时实现对建造顺序的调度和指挥工作
     * 但是，当建造的调度相对复杂时，最好还是通过指挥者进行构建，同时该方法也违反了：单一职责原则
     * @return
     */
    public Actor build() {
        buildName();
        buildType();
        return actor;
    }

}
