#设计模式:async-method-invocation(异步方法调用)
##属于:Concurrency(并发)
##目的:异步方法调用是在等待任务结果时不阻塞调用线程的模式。该模式提供多个独立任务的并行处理，并通过回调检索结果或等待一切完成。
##适用范围
- 多个可以并行运行的独立任务
- 需要提高一组顺序任务的性能
- 具有有限的处理能力或长时间运行的任务，并且调用者不应等待任务准备就绪