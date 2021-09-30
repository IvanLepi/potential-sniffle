package dev.ivanlepi.autowired;

import org.springframework.stereotype.Component;

@Component("wordFormatter")
public class WordFormatter{
    public String format(String toBeFormatted) {
       return toBeFormatted.toUpperCase();
     }
}
