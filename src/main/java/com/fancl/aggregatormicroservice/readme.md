#设计模式:aggregator-microservices(聚合器-微服务)
##属于:Architectural(构建型)
##目的:用户对聚合器进行一次调用，然后聚合器调用每个相关的微服务并收集数据，将业务逻辑应用于它，并进一步发布为REST端点。聚合器的更多变化是：
- 代理微服务设计模式：根据业务需求调用不同的微服务。
- 链式微服务设计模式：在这种情况下，每个微服务依赖/链接到一系列其他微服务。
##适用范围
无论客户端设备如何，当您需要针对各种微服务的统一API时，请使用Aggregator Microservices模式。

其本质是对spring-boot构建和调用微服务api的一种描述，多个基层服务端开放实现不同的接口，调用客户端根据需求调用不同基层服务端接口，并且可以重新开放出新的接口，给其他客户端调用