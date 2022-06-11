package com.mx.ile.fp.findword.utils;

import java.util.Map;
import java.util.function.Function;

@FunctionalInterface
public interface IFunctionalFindWord {

    public Map<String , Integer> findWord (Map<String, Integer> result);
}
