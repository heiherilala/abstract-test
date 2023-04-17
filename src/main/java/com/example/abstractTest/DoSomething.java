package com.example.abstractTest;

public class DoSomething {
    ConcreteClass1 concreteClass1 = new ConcreteClass1(new ConcreteDependance1() , new ConcreteDependance2());
    concreteClass1.method2("sdfsdf");
}
