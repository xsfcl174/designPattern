#设计模式:bridge(桥接)
##属于:Structural(结构)
##目的:将抽象与其实现分离，以使两者可以独立变化。
##适用范围
- 希望避免抽象与其实现之间的永久绑定。例如，必须在运行时选择或切换实现时可能就是这种情况。
- 抽象及其实现都应该通过子类化来扩展。在这种情况下，桥模式允许您组合不同的抽象和实现并独立扩展它们
- 抽象实现的变化应该对客户没有影响; 也就是说，他们的代码不应该被重新编译。
- 你有很多类。这样的类层次结构表明需要将对象分成两部分.Rumbaugh 使用术语“嵌套的泛化”来表述这样的类层次结构
- 想在多个对象之间共享一个实现（可能使用引用计数），这个事实应该从客户端隐藏。