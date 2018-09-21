#设计模式:business delegate(业务代表)
##属于:Business Tier(业务层)
##目的:Business Delegate模式在表示层和业务层之间添加了一个抽象层。通过使用模式，我们获得了层之间的松散耦合，并封装了有关如何定位，连接到构成应用程序的业务对象以及与之交互的知识。
##适用范围
- 想要在实际调用和业务层之间松散耦合
- 想要协调对多个业务服务的调用
- 想要封装服务查找和服务调用