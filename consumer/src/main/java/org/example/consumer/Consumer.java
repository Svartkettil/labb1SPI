package org.example.consumer;

import org.example.service.WordTwister;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {

        static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ServiceLoader<WordTwister> twistedWords = ServiceLoader.load(WordTwister.class);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        {
            for (var twister : twistedWords){
                System.out.println(twister.twist(sentence));
            }
        }
    }
}
