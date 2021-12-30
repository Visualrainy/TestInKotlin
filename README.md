# TestInKotlin
Difference between Dummy Object, Test Stub, Test Spy, Test Mock

###名词介绍
> SUT：待测组件
> 
> DOC：待测组件的依赖

* Dummy Object: 占位填充符，运行中不会实际用到；Dummy是在测试中仅发挥占位填充符的作用，在测试中不会被使用，也不参与测试行为或状态的验证。常见的场景是作为被测函数的某个参数占位符，以减少参数的构造成本。
* Fake Object: 真实依赖的简化版本；Fake 是模拟被测系统所依赖的那个组件，它是生产环境下这个被依赖组件的功能实现的**简化版本**。Fake对象是用于测试的，但它既不是测试中的控制点(control point )，也不是观测点(observation point )。
* Stub Object: 控制SUT的间接输入；Stub提供在测试过程中对请求调用的屏蔽式应答，通常对该测试程序之外的任何内容都无响应。即：Stub只是返回一个规定的值，而不会去涉及到系统的任何改变。它通常是测试中的控制点(control point)。
* Spy Object: 记录和验证SUT的间接输出；Spy可以看做是一类Stub，但是，它会记录它在被调用后的一些信息
* Mock Object: 验证SUT和DOC的交互；Mock和Stub有一定的重合性，比较大的区别是 Mock 专注于观察点，而 Stub 专注于 控制点。或者从另一个角度上面来说，Mock会验证行为的变更，而Stub只是状态的一个变化而已。

* https://www.continuousdelivery20.com/blog/tott-stub-faked-mock/