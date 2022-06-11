package com.mx.ile.fp.findword.app;

import com.mx.ile.fp.findword.utils.IFunctionalAddWords;
import com.mx.ile.fp.findword.utils.IFunctionalFindWord;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ProcessData {
    private String frase = "Hola mama pero pero te quiero mucho  pero pero mucho mucho mucho mama pero en verdad mucho mucho mama pero pero pero ";
    //2.- convertirlas en Array de string
    private final Function<String , String[]> convertToStringArray = word -> word.split(" ");

    private final String[]wordsArray = convertToStringArray.apply(frase);

    private final IFunctionalAddWords functionalAddWords = (wA) -> {
        int index = 1;
        Map<String , Integer> words = new HashMap<>();

        for (int i = 0; i < wA.length; i++) {
            if(words.containsKey(wA[i])){
                //entra cuando ya se ha añadido un valor al mapa o sea puede ser mayor a 1
                index = words.get(wA[i])+1;
                words.put(wA[i] ,index);

            }else {
                words.put(wA[i] , 1);
            }
        }
        return words;
    };


    IFunctionalFindWord functionalFindWord = (words) ->{
        int value = words.get(wordsArray[0]);
        String word = wordsArray[0];
        for(int i = 1; i< words.size(); i++){
            if(value < words.get(wordsArray[i])){
                value = words.get(wordsArray[i]);
                word = wordsArray[i];
            }
        }

        return Collections.singletonMap(word , value);
    };



    public void excecute(){
        Map<String, Integer> finalMap = functionalFindWord.findWord(functionalAddWords.addToWordsMap(wordsArray));
        System.out.println(finalMap);
    }
}
