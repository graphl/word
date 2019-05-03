package com.word.test;

public class Card {


        int interval;
        int Repetition;
        double efactor = 2.5;

        int overDueDate = 0; // should be a date (here 0 = today);
        int grad = 0;

        String Q = "";
        String A = "";



        public Card(String Q, String A) {
            this.Q = Q;
            this.A = A;
        }

        @Override
        public String toString() {
            String s = "Card{" + "interval=" + interval + ", Repetition=" + Repetition + ", efactor=" + efactor + ", overDueDate=" + overDueDate + ", grad=" + grad + ", Q=" + Q + ", A=" + A + '}';
            System.out.println(s);
            return s;
        }

}
