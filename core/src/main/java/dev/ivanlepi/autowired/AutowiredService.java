package dev.ivanlepi.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredService {

    @Autowired
    WordFormatter wordFormatter;

    public String formatThis(String word){
        return wordFormatter.format(word);
    }

}
