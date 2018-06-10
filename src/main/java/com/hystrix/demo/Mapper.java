package com.hystrix.demo;

import java.util.function.Function;

public class Mapper implements Function<Integer,String> {
    @Override
    public String apply(Integer integer) {
        return integer.toString()+" added value";
    }
}
