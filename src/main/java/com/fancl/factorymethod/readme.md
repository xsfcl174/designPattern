#设计模式:factory-method(工厂方法)
##属于:Creational(创建型)
##目的:定义用于创建对象的接口，但让子类决定实例化哪个类。Factory Method允许类将实例化延迟到子类。
##适用范围
- 类不能预期它实际对应的对象类
- 一个类希望它的子类指定它创建的对象
- classes将责任委托给几个辅助子类之一，并且希望在具体使用的时候才知道哪个辅助子类是被委托创建的
##现实中的例子
- java.util.Calendar
- java.util.ResourceBundle
- java.text.NumberFormat
- java.nio.charset.Charset
- java.net.URLStreamHandlerFactory
- java.util.EnumSet
- javax.xml.bind.JAXBContext