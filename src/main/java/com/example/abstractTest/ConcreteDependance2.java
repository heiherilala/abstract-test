package com.example.abstractTest;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ConcreteDependance2 {
    public static void method2(String strg) {
        System.out.println(strg);
    };
}
