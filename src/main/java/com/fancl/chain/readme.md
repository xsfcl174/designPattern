#设计模式:chain(职责链)
##属于:Behavioral(行为型)
##目的:通过为多个对象提供处理请求的机会，避免将请求的发送者耦合到其接收者。链接接收对象并沿链传递请求，直到对象处理它。
##适用范围
- 多个对象可以处理请求，并且处理程序不是先验已知的。应自动确定处理程序
- 希望向几个对象之一发出请求，而不明确指定接收方
- 应动态指定可以处理请求的对象集

##现实中的例子
- java.util.logging.Logger#log()
- Apache Commons Chain
- javax.servlet.Filter#doFilter()