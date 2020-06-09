package com.helloworld;

public class Lab5 {

    public static void main(String[] args) {
        // write your code here
        String text = "Hello world Avita";
        System.out.println( StringActs.doAct(text));


    }

    public static class Words{
        public static String[] words;
    }

    public static class Letters{
        public static char[] letters ;
    }

    public static class Sentences{
        public static String[] sentences;
    }

    public static class NewStringActs{ // 5 ЛАБОРАТОРНА
        public static String doNewAct(String text) {

            Words.words = text.split(" ");
            text = "";

            for(int i = 0; i < Words.words.length ; i ++){



                if (StringActs.isVowel(Words.words[i].charAt(0))) {
                    if(Words.words[i].length() == 5){
                        Words.words[i] = "";
                    }
                }

            }
            for(int i = 0; i < Words.words.length; i++){
                text += Words.words[i] + " ";
            }


            return text ;
        }

    }

    public static class StringActs {

        public static boolean isVowel(char c) { return "AEIOUYaeiouy".indexOf(c) == -1;}

        static char[] v = "AaEeUuIiOo".toCharArray();

        public static String doAct(String text) {

            String[] lines = text.split(" ");
            text = "";

            for(int i = 0; i < lines.length ; i ++){



                if (StringActs.isVowel(lines[i].charAt(0))) {
                    if(lines[i].length() == 5){
                        lines[i] = "";
                    }
                }

            }
            for(int i = 0; i < lines.length; i++){
                text += lines[i] + " ";
            }


            return text ;
        }
    }
}
