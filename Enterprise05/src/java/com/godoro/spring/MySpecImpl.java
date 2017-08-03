
package com.godoro.spring;

import org.springframework.stereotype.Service;

@Service
public class MySpecImpl implements MySpec{

    @Override
    public int substract(int left, int right) {
        return left-right;
    }
    
}
