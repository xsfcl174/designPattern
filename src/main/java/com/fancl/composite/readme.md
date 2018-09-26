#设计模式:composite(组合)
##属于:Structural(结构型)
##目的:将对象组合成树结构以表示部分整体层次结构。Composite允许客户端统一处理单个对象或对象组合。
##适用范围
- 想要表示对象的部分整体层次结构
- 希望客户能够忽略对象和单个对象的组合之间的差异。客户端将统一处理复合结构中的所有对象

##现实中的例子
- java.awt.Container和java.awt.Component
- Apache Wicket组件树，请参阅Component和MarkupContainer