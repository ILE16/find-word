package com.mx.ile.fp.findword.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@FunctionalInterface
public interface IFunctionalAddWords {

    public Map<String , Integer> addToWordsMap(String[] wordsArray);

}
