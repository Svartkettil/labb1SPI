package org.example.provider;

import org.example.service.WordTwister;

public class TwistAllWords implements WordTwister {

    @Override
    public String twist(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
                words[i] = new StringBuilder().append(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }
}
