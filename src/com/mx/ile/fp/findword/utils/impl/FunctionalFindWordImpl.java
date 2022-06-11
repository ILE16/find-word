package com.mx.ile.fp.findword.utils.impl;

import java.util.Map;
import java.util.function.Function;

public class FunctionalFindWordImpl {
    public Map<String , Integer> findingWord(Map<String, Integer> result, Function<Map<String , Integer> , Map<String, Integer>> words){
        return words.apply(result);
    }
}
