package com.progra.hangman.base;

import java.util.List;

public class Word {
        private int id;
        String word;
        private String level;
        int Maxtries;
        private int tries;



        public Word( int maxtries, String word){
                this.Maxtries = maxtries;
                this.word = word;
            }

            public int getId () {
                return id;
            }

            public String getWord () {
                return word;
            }

            public int getlength () {
                return word.length();
            }
            public int getMaxtries () {
                return Maxtries;
            }

            public String getLevel () {
                return level;
            }

            public void toUpperCase () {
                this.word = this.word.toUpperCase();
            }

        public boolean contains(String letter) {
            return word.contains(letter);
        }


    }


