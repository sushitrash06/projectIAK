package com.example.android.weebs;

public class soal {

    public String mQuestions[] = {
            "The maker does'nt need it, the buyer does'nt use it, the user uses it without knowing. What is it?", //pr1
            "The more of them you take, the more you leave behind. What are they?", //pr2
            "What flies without wings?",//pr3
            "What’s full of holes but still holds water?",//pr4
            "Give it food and it will live, give it water and it will die. What is it?",//pr5
            "I run, yet I have no legs. What am I?",//pr6
            "The more there is, the less you see",//pr7
            "What kinds of room has no windows or door?What kinds of room has no windows or door?",//pr8
            "Only two backbones and thousands of ribs.",//pr9
            "Gladys was just about to go to his room and suddenly he heard his parents shouting: 'Surpriseeeeee' Gladys smiled, he asked 'What's wrong?' 'Happy Birthday dear!' Dad said. 'This is iPad for you, are you happy?' 'Where? I did not see the iPad at all? 'They all fell silent.",//pr10
    };

    private String mChoices [][] = {
            {"A coffin", "A pencil", "A fan", "A Knife"}, //pr1
            {"Food", "Task ", "Footsteps", "mind"}, //pr2
            {"Bird", "Frog", "mind", "time"}, //pr3
            {"sponge", "well", "bowl", "beach"}, //pr4
            {"Fish", "Fire", "Water", "Baby"}, //pr5
            {"Snake", "Bird", "Thief", "Nose"}, //pr6
            {"Home", "Weakness", "School", "Darkness"}, //pr7
            {"Mushroom", "Home", "Bedroom", "Snail"},   //pr8
            {"Railroad", "Centipede", "Robot", "one thousand feet"}, //pr9
            {"Gladys did'nt like an iPod", "Gladys is a blind", "Gladys is a android fan girl fangirl", "they are lie"}, //pr10
    };

    private String mCorrectAnswers[] = {"A coffin", "Footsteps", "time", "sponge", "Fire", "Nose", "Darkness", "Mushroom", "Railroad", "Gladys is a blind"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice =  mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice =  mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice =  mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice =  mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
