#设计模式:Acyclic Visitor(非循环访问者)
##属于:Behavioral(行为型)
##目的:允许将新函数添加到现有的类层次结构中，而不会影响这些层次结构，并且不会创建GOF VISITOR模式固有的麻烦的依赖循环。
##适用范围
- 需要向现有层次结构添加新功能时，无需更改或影响该层次结构
- 当存在对层次结构进行操作但不属于层次结构本身的函数时。例如ConfigureForDOS / ConfigureForUnix / ConfigureForX问题。
- 需要根据对象的类型对对象执行非常不同的操作时
- 当访问类层次结构经常使用Element类的新衍生物进行扩展时
- 当重新编译，重新链接，重新测试或重新分配Element的衍生物代价很高时