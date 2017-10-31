package com.fancl.build;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 *
 * 指挥者
 */
public class ActorController {
    public static void main(String[] args) {
        ActorBuilder builder = new AngelBuilder();
        ActorController controller = new ActorController();
        final Actor build = controller.build(builder);
        System.out.println(build.getName());
        System.out.println(build.getType());
    }

    public Actor build(ActorBuilder builder) {
        builder.buildName();
        builder.buildType();
        return builder.getResult();
    }
}
