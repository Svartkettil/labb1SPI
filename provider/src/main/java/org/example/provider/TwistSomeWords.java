package org.example.provider;

import org.example.service.WordTwister;

public class TwistSomeWords implements WordTwister {
        @Override
        public String twist(String sentence){
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() >= 5)
                    words[i] = new StringBuilder().append(words[i]).reverse().toString();
            }
            return String.join(" ", words);
        }
}
