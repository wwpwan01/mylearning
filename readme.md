# 23种设计模式

## 1、创建型：提供创建对象的机制，提升代码的灵活性和可复用性

### 常用：

单例（singleton）：

​	饿汉式：不支持延时加载，如果加载了类没有使用，会造成资源浪费

​	懒汉式：支持延时加载

![单例](\class_map\单例.png)

简单工厂：

​	优点：容易扩展

​	缺点：增加新产品时需要修改工厂的代码，违反开闭原则

工厂方法（Factory Method）：

​	场景：需要创建的对象较少，不关心对象的创建的过程

​	有点：容易扩展

​	缺点：扩展性不好，创建工厂类，需要创建哪个对象，就增加创建的方法，可以增加权限控制，增加新产品时需要修改工厂的代码，违反开闭原则

![工厂方法](\class_map\工厂方法.png)

抽象工厂（abstract Factory）：

建造者（builder）：

### 不常用：

原型（prototype）：

## 2、结构型模式：介绍如何将对象和类组装成较大的结构，并同时保持结构的灵活性和高效性

### 常用：

代理（proxy）：

桥接（bridge）：

装饰（decorator）:

适配器（adapter）

### 不常用：

外观（facade）：

组合（composite）：

享元（Flyweight）:

## 3、行为模式：负责对象间的高效沟通和职责传递委派

### 常用：

观察者（observer）：

模板方法（templat Method）:

策略（strategy）：

责任链（chain of responsibility）：

迭代器（Iterator）：

状态（state）：

### 不常用：

访问者（visitor）：

备忘录（memento）：

命令（command）：

解释器（Interpreter）：

中介者（mediator）：