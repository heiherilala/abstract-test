package com.example.abstractTest;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    protected ConcreteDependance1 concreteDependance1;//not private
    protected ConcreteDependance2 concreteDependance2;//not private

    public AbstractClass1(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2) {
        this.concreteDependance1 = concreteDependance1;
        this.concreteDependance2 = concreteDependance2;
    }
}
