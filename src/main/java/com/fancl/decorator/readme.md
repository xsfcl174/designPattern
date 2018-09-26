#设计模式:decorator(装饰)
##属于:Structural(结构型)
##目的:动态地将附加职责附加到对象。装饰器为子类化提供了灵活的替代扩展功能。
##适用范围
- 动态且透明地向各个对象添加职责，即不影响其他对象
- 各个类的职责更加明确
- 通过子类扩展是不切实际的。有时可能会有大量独立扩展，并会产生大量子类以支持每种组合。或者类定义可能隐藏或不可用于子类化

##现实中的例子
- java.io.InputStream，java.io.OutputStream， java.io.Reader和java.io.Writer
- java.util.Collections中＃synchronizedXXX（）
- java.util.Collections中＃unmodifiableXXX（）
- java.util.Collections中＃checkedXXX（）