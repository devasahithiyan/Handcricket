import java.awt.*;
import java.util.Random;

public class Main {
static int score = 0;
static int opponentnput = 0;
static int yourinput  = 0;

static  int targetscore = 0;

   static Label scorecount;

   static  Label targetscorel;
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(null);
        f.setTitle("Hand cricket");

   Button heads = new Button("Heads");
   heads.setBounds(110, 140, 80, 30);
   f.add(heads);
   heads.setVisible(true);



   Button tails = new Button("Tails");
   tails.setBounds(190,140,80,30);
   f.add(tails);
   tails.setVisible(true);

            tails.addActionListener(e ->{
            boolean result = toss(0);
heads.setVisible(false);
            if(result){
                Label wontoss = new Label("Congratulations you won the toss");
                wontoss.setBounds(40,280,200,30);
                wontoss.setVisible(true);
                f.add(wontoss);
                tails.setVisible(false);
                choose(f , wontoss);
            } else {
                tossresult(f);
                tails.setVisible(false);
            }




        });

        heads.addActionListener(e -> {
            boolean result = toss(0);
             tails.setVisible(false);
            if(result){
                Label wontoss = new Label("Congratulations you won the toss");
                wontoss.setBounds(40,280,300,30);

                f.add(wontoss);
                wontoss.setVisible(true);
                choose(f , wontoss);

                heads.setVisible(false);


            } else {
                tossresult(f);
                heads.setVisible(false);

            }

        });




    }

    public static boolean toss(int num){
        Random random = new Random();
        int x = random.nextInt(2);

        return num == x;
    }

    public static void tossresult(Frame f){

             Random random = new Random();
            int x = random.nextInt(2);
            if(x == 1){
                Label losstoss = new Label("Opponent won the toss and chose to Bat first");
                losstoss.setBounds(20,360,300,30);
                losstoss.setVisible(true);
                f.add(losstoss);
                bowl(f ,losstoss);
                //losstoss.setVisible(false);
            } else {
                Label losstoss = new Label("Opponent won the toss and chose to Bowl first");
                losstoss.setBounds(20,360,300,30);
                losstoss.setVisible(true);
                f.add(losstoss);
                bat(f , losstoss);

            }

        }

        public static  void choose(Frame f , Label wontoss){

        Button Batting = new Button("Bat first");
        Batting.setVisible(true);
        Batting.setBounds(30,60,100,20);
        f.add(Batting);

 Label summa = new Label();
        Button Bowling = new Button("Bowl first");
        Bowling.setVisible(true);
        Bowling.setBounds(30,80,100,20);
        f.add(Bowling);

        Batting.addActionListener(e -> {
                Batting.setVisible(false);
                Bowling.setVisible(false);
                bat(f , summa);
                wontoss.setVisible(false);


            });

        Bowling.addActionListener(e -> {
            Batting.setVisible(false);
            Bowling.setVisible(false);
            bowl(f , summa);
            wontoss.setVisible(false);
        });
        }

        public static void bat(Frame f , Label tossresult){

             Random random = new Random();


             scorecount = new Label("Score :" +score);
            scorecount.setBounds(30, 100, 100, 20);
            f.add(scorecount);

            Label userinput = new Label("Your input : "+ yourinput);
            userinput.setBounds(120,170,250,20);
            f.add(userinput);

            Label opponentinput = new Label("Opponent input :" +opponentnput);
            opponentinput.setBounds(120,200,250,20);
            f.add(opponentinput);

            Label out = new Label("Out!!");
            out.setBounds(120,250,250,20);
            f.add(out);
            out.setVisible(false);

            Button defendsc = new Button("Defend");
            defendsc.setBounds(120, 300,250,20);
            f.add(defendsc);
            defendsc.setVisible(false);

            defendsc.addActionListener(e -> {
                defend(f, score);
                defendsc.setVisible(false);
                out.setVisible(false);
                opponentinput.setVisible(false);
                userinput.setVisible(false);
            });


            targetscorel = new Label("Targetscore : " +score);
            targetscorel.setBounds(70,350,200,20);
            f.add(targetscorel);
            targetscorel.setVisible(false);





            Button number1 = new Button("1");
        number1.setBounds(50,60,30,20);
        f.add(number1);


         Button number2 = new Button("2");
           number2.setBounds(100,60,30,20);
           f.add(number2);

           Button number3 = new Button("3");
            number3.setBounds(150,60,30,20);
            f.add(number3);

            Button number4 = new Button("4");
            number4.setBounds(200,60,30,20);
            f.add(number4);

            Button number5 = new Button("5");
            number5.setBounds(250,60,30,20);
            f.add(number5);

            Button number6 = new Button("6");
            number6.setBounds(300,60,30,20);
            f.add(number6);


            number1.addActionListener(e ->{
                opponentnput = random.nextInt(6) + 1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+1));

                if(opponentnput == 1){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    defendsc.setVisible(true);
                } else {

                    score = score + 1;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));
                }

            });

            number2.addActionListener(e ->{
                opponentnput = random.nextInt(6) + 1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+2));

                if(opponentnput == 2){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    defendsc.setVisible(true);
                } else {

                    score = score + 2;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));
                }
            });

            number3.addActionListener(e ->{
                opponentnput = random.nextInt(6) + 1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+3));

                if(opponentnput == 3){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    tossresult.setVisible(false);
                    targetscorel.setVisible(true);
                    defendsc.setVisible(true);
                } else {

                    score = score + 3;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));
                }
            });

            number4.addActionListener(e ->{
                opponentnput = random.nextInt(6) + 1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+4));

                if(opponentnput == 4){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    defendsc.setVisible(true);
                } else {

                    score = score + 4;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));
                }
            });

            number5.addActionListener(e ->{
                opponentnput = random.nextInt(6) + 1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+5));

                if(opponentnput == 5){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    tossresult.setVisible(false);
                    targetscorel.setVisible(true);
                    defendsc.setVisible(true);
                } else {

                    score = score + 5;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));
                }
            });

            number6.addActionListener(e ->{
                opponentnput = random.nextInt(6) + 1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+6));

                if(opponentnput == 6){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    tossresult.setVisible(false);
                    defendsc.setVisible(true);
                    targetscorel.setVisible(true);
                } else {

                    score = score + 6;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));
                }


            });



        }

        public static void bowl(Frame f , Label tossresult){
            Random random = new Random();


            scorecount = new Label("Opponent Score :" +score);
            scorecount.setBounds(30, 100, 100, 20);
            f.add(scorecount);

            Label userinput = new Label("Your input : "+ yourinput);
            userinput.setBounds(120,170,250,20);
            f.add(userinput);

            Label opponentinput = new Label("Opponent input :" +opponentnput);
            opponentinput.setBounds(120,200,250,20);
            f.add(opponentinput);

            Label out = new Label("Out!!");
            out.setBounds(120,250,250,20);
            f.add(out);
            out.setVisible(false);

            Button number1 = new Button("1");
            number1.setBounds(50,60,30,20);
            f.add(number1);


            Button number2 = new Button("2");
            number2.setBounds(100,60,30,20);
            f.add(number2);

            Button number3 = new Button("3");
            number3.setBounds(150,60,30,20);
            f.add(number3);

            Button number4 = new Button("4");
            number4.setBounds(200,60,30,20);
            f.add(number4);

            Button number5 = new Button("5");
            number5.setBounds(250,60,30,20);
            f.add(number5);

            Button number6 = new Button("6");
            number6.setBounds(300,60,30,20);
            f.add(number6);

            Button chase = new Button("Chase");
            chase.setBounds(120,290,100,20);
            f.add(chase);
            chase.setVisible(false);

            chase.addActionListener( e ->{
                chase(f, score );
                chase.setVisible(false);
                out.setVisible(false);
                opponentinput.setVisible(false);
                userinput.setVisible(false);
            });

            targetscorel = new Label("Targetscore : " +targetscore);
            targetscorel.setBounds(100,350,150,20);
            f.add(targetscorel);
            targetscorel.setVisible(false);


            number1.addActionListener(e -> {
                opponentnput = random.nextInt(6)+1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+1));
                if(opponentnput == 1){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    chase.setVisible(true);


                } else {

                    score = score + 1;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));


                }

            });

            number2.addActionListener(e -> {
                opponentnput = random.nextInt(6)+1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+2));
                if(opponentnput == 2){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    chase.setVisible(true);
                } else {

                    score = score + 2;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));


                }

            });

            number3.addActionListener(e -> {
                opponentnput = random.nextInt(6)+1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+3));
                if(opponentnput == 3){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    chase.setVisible(true);
                } else {

                    score = score + 3;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));

                }

            });

            number4.addActionListener(e -> {
                opponentnput = random.nextInt(6)+1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+4));
                if(opponentnput == 4){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    chase.setVisible(true);
                } else {

                    score = score + 4;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));

                }

            });


            number5.addActionListener(e -> {
                opponentnput = random.nextInt(6)+1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+5));
                if(opponentnput == 5){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    chase.setVisible(true);
                } else {

                    score = score + 5;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText(String.valueOf("Targetscore : "+targetscore));

                }

            });

            number6.addActionListener(e -> {
                opponentnput = random.nextInt(6)+1;
                opponentinput.setText(String.valueOf("Opponent input :"+opponentnput));
                userinput.setText(String.valueOf("Your input : "+6));
                if(opponentnput == 6){

                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);
                    out.setVisible(true);
                    targetscorel.setVisible(true);
                    tossresult.setVisible(false);
                    chase.setVisible(true);
                } else {

                    score = score + 6;
                    scorecount.setText("Score: " + score);
                    targetscore = score;
                    targetscorel.setText("Targetscore :"+String.valueOf(targetscore));

                }

            });
        }
    public static void chase(Frame f, int targetScore ) {
        Random random = new Random();

        score = 0;
        opponentnput = 0;
        yourinput = 0;


        targetscorel = new Label("Targetscore : " +targetscore);
        targetscorel.setBounds(100,350,160,20);
        f.add(targetscorel);
        targetscorel.setVisible(true);


        scorecount.setText("Score: " + score);
        scorecount.setBounds(30, 100, 100, 20);
        targetscorel.setVisible(false);

        Label userinput = new Label("Your input: " + yourinput);
        userinput.setBounds(120, 170, 250, 20);
        f.add(userinput);

        Label opponentinput = new Label("Opponent input: " + opponentnput);
        opponentinput.setBounds(120, 200, 250, 20);
        f.add(opponentinput);

        Label out = new Label("Out!!");
        out.setBounds(120, 250, 250, 20);
        f.add(out);
        out.setVisible(false);

        Button number1 = new Button("1");
        number1.setBounds(50, 60, 30, 20);
        f.add(number1);

        Button number2 = new Button("2");
        number2.setBounds(100,60,30,20);
        f.add(number2);

        Button number3 = new Button("3");
        number3.setBounds(150,60,30,20);
        f.add(number3);

        Button number4 = new Button("4");
        number4.setBounds(200,60,30,20);
        f.add(number4);

        Button number5 = new Button("5");
        number5.setBounds(250,60,30,20);
        f.add(number5);

        Button number6  = new Button("6");
        number6.setBounds(300, 60 ,30,20);
        f.add(number6);



        number1.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 1));

            if (opponentnput == 1) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 1;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Congratulations! You chased down the target score.");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number2.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 2));

            if (opponentnput == 2) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 2;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Congratulations! You chased down the target score.");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number3.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 3));

            if (opponentnput == 3) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 3;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Congratulations! You chased down the target score.");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number4.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 4));

            if (opponentnput == 4) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 4;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Congratulations! You chased down the target score.");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number5.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 5));

            if (opponentnput == 5) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 5;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Congratulations! You chased down the target score.");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number6.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 6));

            if (opponentnput == 6) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 6;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Congratulations! You chased down the target score.");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });


    }

    public static void defend(Frame f, int targetScore){
        Random random = new Random();

        score = 0;
        opponentnput = 0;
        yourinput = 0;


        targetscorel = new Label("Targetscore : " +targetscore);
        targetscorel.setBounds(100,350,160,20);
        f.add(targetscorel);
        targetscorel.setVisible(true);


        scorecount.setText("Score: " + score);
        scorecount.setBounds(30, 100, 100, 20);
        targetscorel.setVisible(false);

        Label userinput = new Label("Your input: " + yourinput);
        userinput.setBounds(120, 170, 250, 20);
        f.add(userinput);

        Label opponentinput = new Label("Opponent input: " + opponentnput);
        opponentinput.setBounds(120, 200, 250, 20);
        f.add(opponentinput);

        Label out = new Label("Out!, You won the match");
        out.setBounds(120, 250, 250, 20);
        f.add(out);
        out.setVisible(false);

        Button number1 = new Button("1");
        number1.setBounds(50, 60, 30, 20);
        f.add(number1);

        Button number2 = new Button("2");
        number2.setBounds(100,60,30,20);
        f.add(number2);

        Button number3 = new Button("3");
        number3.setBounds(150,60,30,20);
        f.add(number3);

        Button number4 = new Button("4");
        number4.setBounds(200,60,30,20);
        f.add(number4);

        Button number5 = new Button("5");
        number5.setBounds(250,60,30,20);
        f.add(number5);

        Button number6  = new Button("6");
        number6.setBounds(300, 60 ,30,20);
        f.add(number6);



        number1.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 1));

            if (opponentnput == 1) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 1;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Opponent won the match !");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number2.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 2));

            if (opponentnput == 2) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 2;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Opponent won the match !");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number3.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 3));

            if (opponentnput == 3) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 3;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Opponent won the match !");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number4.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 4));

            if (opponentnput == 4) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 4;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Opponent won the match !");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number5.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 5));

            if (opponentnput == 5) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 5;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Opponent won the match !");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });

        number6.addActionListener(e -> {
            opponentnput = random.nextInt(6) + 1;
            opponentinput.setText(String.valueOf("Opponent input: " + opponentnput));
            userinput.setText(String.valueOf("Your input: " + 6));

            if (opponentnput == 6) {
                number1.setVisible(false);
                number2.setVisible(false);
                number3.setVisible(false);
                number4.setVisible(false);
                number5.setVisible(false);
                number6.setVisible(false);
                out.setVisible(true);
            } else {
                score += 6;
                scorecount.setText("Score: " + score);

                if (score >= targetScore) {
                    Label chaseResult = new Label("Opponent won the match !");
                    chaseResult.setBounds(20, 300, 300, 30);
                    f.add(chaseResult);
                    number1.setVisible(false);
                    number2.setVisible(false);
                    number3.setVisible(false);
                    number4.setVisible(false);
                    number5.setVisible(false);
                    number6.setVisible(false);

                }
            }
        });




    }



}





