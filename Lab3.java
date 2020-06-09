package com.helloworld;

public class Lab3 {

    public static void main(String[] args) {
        // write your code here
        String text = "Hello world Avita";
        System.out.println( StringActs.doAct(text));


    }

    public static class StringActs {

        public static boolean isVowel(char c) { return "AEIOUYaeiouy".indexOf(c) == -1;}

        static char[] v = "AaEeUuIiOo".toCharArray();

        public static String  doAct(String text) {

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


            return text;
        }
    }
}
