package com.mx.ile.fp.findword.utils.impl;

import com.mx.ile.fp.findword.utils.IFunctionalAddWords;

import java.util.Map;

public class FunctionalAddWordsImpl  {
    public Map<String, Integer> obtenerPalabraMasRepetida(String[] arrayWords, IFunctionalAddWords words) {
        return words.addToWordsMap(arrayWords);
    }

}
