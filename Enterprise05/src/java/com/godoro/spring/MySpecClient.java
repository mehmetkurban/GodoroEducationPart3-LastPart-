
package com.godoro.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySpecClient {
    @Autowired
    public MySpec mySpec;
    
    public int decrement(int number){
        return mySpec.substract(number, 1);
    }
}
