package com.liu.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>(); // 儲存數字的number集合
    int numberCount = 0;
    public abstract void generate();
    public boolean validate(){
        if (numbers.size() == numberCount)
            return true;
        else
            return false;
    }
}
