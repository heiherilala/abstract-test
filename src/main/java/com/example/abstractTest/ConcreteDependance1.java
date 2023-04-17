package com.example.abstractTest;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ConcreteDependance1 {
    public void method1(String strg) {
        System.out.println(strg);
    };
}
