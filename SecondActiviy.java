package com.sethu.codetribe.kids;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActiviy extends AppCompatActivity {



    private TextView txtQ1;
    private TextView txtQ2;
    private TextView txtQ3;
    private TextView txtQ4;
    private TextView txtQ5;
    int id ;
    int count = 1;
    int total=0;
    int checkID;
    private RadioGroup rdgroup1;
    private RadioGroup rdgroup2;
    private RadioGroup rdgroup3;
    private RadioGroup rdgroup4;
    private RadioGroup rdgroup5;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiy);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle intent = getIntent().getExtras();
        id = intent.getInt(MainActivity.ids);


        rdgroup1 = (RadioGroup)findViewById(R.id.rdgrp1);
        rdgroup2 = (RadioGroup)findViewById(R.id.rdgrp2);
        rdgroup3 = (RadioGroup)findViewById(R.id.rdgrp3);
        rdgroup4 = (RadioGroup)findViewById(R.id.rdgrp4);
        rdgroup5 = (RadioGroup)findViewById(R.id.rdgrp5);

        if (id == 1) {
            ImageView imag = (ImageView) findViewById(R.id.animl);
            imag.setImageResource(R.drawable.animals);

            getSupportActionBar().setTitle("Animals");
            // questions
            String animalQuetions[] = {"Which animal does it have four legs?",
                    "Which animal doesn't make noise when it cries?",
                    "Which animal does it have long neck?",
                    "Which animal is the biggest of them all?",
                    "Which animal does it have two legs?"};

            //answers
            String answer1Q1[] = {"Chicken", "Goat", "Bird"};
            String answer2Q2[]= {"Lion", "Cat", "Sheep"};
            String answer3Q3[] ={"Chicken", "Giraffe", "Zebra"};
            String answer4Q4[] ={"Fish", "Dog", "Elephant"};
            String answer5Q5[]=  {"Bird", "Pig", "Leopard"};

            //textwies for questions
            txtQ1= (TextView)findViewById(R.id.textView);
            txtQ2= (TextView)findViewById(R.id.txtQuestion2);
            txtQ3= (TextView)findViewById(R.id.txtQuestion3);
            txtQ4= (TextView)findViewById(R.id.txtQuestion4);
            txtQ5= (TextView)findViewById(R.id.txtQuestion5);

            //radiobuttons for answer1
            RadioButton rbAnswer1Q1 = (RadioButton) findViewById(R.id.rdAnswer1Q1);
            RadioButton rbAnswer2Q1 = (RadioButton) findViewById(R.id.rdAnswer2Q1);
            RadioButton rbAnswer3Q1= (RadioButton) findViewById(R.id.rdAnswer3Q1);

            //radiobuttons for answer2
            RadioButton rbAnswer1Q2 = (RadioButton) findViewById(R.id.rdAnswer1Q2);
            RadioButton rbAnswer2Q2 = (RadioButton) findViewById(R.id.rdAnswer2Q2);
            RadioButton rbAnswer3Q2 = (RadioButton) findViewById(R.id.rdAnswer3Q2);

            //radiobuttons for answer3
            RadioButton rbAnswer1Q3 = (RadioButton) findViewById(R.id.rdAnswer1Q3);
            RadioButton rbAnswer2Q3 = (RadioButton) findViewById(R.id.rdAnswer2Q3);
            RadioButton rbAnswer3Q3 = (RadioButton) findViewById(R.id.rdAnswer3Q3);

            //radiobuttons for answer4
            RadioButton rbAnswer1Q4 = (RadioButton) findViewById(R.id.rdAnswer1Q4);
            RadioButton rbAnswer2Q4 = (RadioButton) findViewById(R.id.rdAnswer2Q4);
            RadioButton rbAnswer3Q4 = (RadioButton) findViewById(R.id.rdAnswer3Q4);

            //radiobuttons for answer5
            RadioButton rbAnswer1Q5 = (RadioButton) findViewById(R.id.rdAnswer1Q5);
            RadioButton rbAnswer2Q5 = (RadioButton) findViewById(R.id.rdAnswer2Q5);
            RadioButton rbAnswer3Q5 = (RadioButton) findViewById(R.id.rdAnswer3Q5);



            // setting questions
            txtQ1.setText(animalQuetions[0]);
            txtQ2.setText(animalQuetions[1]);
            txtQ3.setText(animalQuetions[2]);
            txtQ4.setText(animalQuetions[3]);
            txtQ5.setText(animalQuetions[4]);


            //setting radio button for Q1
            rbAnswer1Q1.setText(answer1Q1[0].toString());
            rbAnswer2Q1.setText(answer1Q1[1].toString());
            rbAnswer3Q1.setText(answer1Q1[2].toString());

            //setting radio button for Q2
            rbAnswer1Q2.setText(answer2Q2[0].toString());
            rbAnswer2Q2.setText(answer2Q2[1].toString());
            rbAnswer3Q2.setText(answer2Q2[2].toString());

            //setting radio button for Q3
            rbAnswer1Q3.setText(answer3Q3[0].toString());
            rbAnswer2Q3.setText(answer3Q3[1].toString());
            rbAnswer3Q3.setText(answer3Q3[2].toString());

            //setting radio button for Q4
            rbAnswer1Q4.setText(answer4Q4[0].toString());
            rbAnswer2Q4.setText(answer4Q4[1].toString());
            rbAnswer3Q4.setText(answer4Q4[2].toString());

            //setting radio button for Q4
            rbAnswer1Q5.setText(answer5Q5[0].toString());
            rbAnswer2Q5.setText(answer5Q5[1].toString());
            rbAnswer3Q5.setText(answer5Q5[2].toString());

        } else if(id ==2) {
            ImageView imag = (ImageView) findViewById(R.id.animl);
            imag.setImageResource(R.drawable.ball);
            String sportQuetions[] = {"Which is the national sport of canada?",
                    "When was the common wealth game started?",
                    "Football world cup has been won by which country for the maximum number of times?",
                    "Where was the first olympic games held?",
                    "Who was the winner of football world cup in 2010?"};

            String answer1Q1[] = {"Ice hockey", "Cricket", "Volleyball"};
            String answer2Q2[] = {"1930", "1934", "1938"};
            String answer3Q3[] = {"Italy", "West germany", "Brazil"};
            String answer4Q4[] = {"England", "Canada", "Australia"};
            String answer5Q5[] = {"Italy", "France", "Spain"};


            getSupportActionBar().setTitle("Sport");
            txtQ1= (TextView)findViewById(R.id.textView);
            txtQ2= (TextView)findViewById(R.id.txtQuestion2);
            txtQ3= (TextView)findViewById(R.id.txtQuestion3);
            txtQ4= (TextView)findViewById(R.id.txtQuestion4);
            txtQ5= (TextView)findViewById(R.id.txtQuestion5);

            //radiobuttons for answer1
            RadioButton rbAnswer1Q1 = (RadioButton) findViewById(R.id.rdAnswer1Q1);
            RadioButton rbAnswer2Q1 = (RadioButton) findViewById(R.id.rdAnswer2Q1);
            RadioButton rbAnswer3Q1= (RadioButton) findViewById(R.id.rdAnswer3Q1);


            //radiobuttons for answer2
            RadioButton rbAnswer1Q2 = (RadioButton) findViewById(R.id.rdAnswer1Q2);
            RadioButton rbAnswer2Q2 = (RadioButton) findViewById(R.id.rdAnswer2Q2);
            RadioButton rbAnswer3Q2 = (RadioButton) findViewById(R.id.rdAnswer3Q2);

            //radiobuttons for answer3
            RadioButton rbAnswer1Q3 = (RadioButton) findViewById(R.id.rdAnswer1Q3);
            RadioButton rbAnswer2Q3 = (RadioButton) findViewById(R.id.rdAnswer2Q3);
            RadioButton rbAnswer3Q3 = (RadioButton) findViewById(R.id.rdAnswer3Q3);

            //radiobuttons for answer4
            RadioButton rbAnswer1Q4 = (RadioButton) findViewById(R.id.rdAnswer1Q4);
            RadioButton rbAnswer2Q4 = (RadioButton) findViewById(R.id.rdAnswer2Q4);
            RadioButton rbAnswer3Q4 = (RadioButton) findViewById(R.id.rdAnswer3Q4);

            //radiobuttons for answer5
            RadioButton rbAnswer1Q5 = (RadioButton) findViewById(R.id.rdAnswer1Q5);
            RadioButton rbAnswer2Q5 = (RadioButton) findViewById(R.id.rdAnswer2Q5);
            RadioButton rbAnswer3Q5 = (RadioButton) findViewById(R.id.rdAnswer3Q5);


            // setting the sport questions
            txtQ1.setText(sportQuetions[0]);
            txtQ2.setText(sportQuetions[1]);
            txtQ3.setText(sportQuetions[2]);
            txtQ4.setText(sportQuetions[3]);
            txtQ5.setText(sportQuetions[4]);

            //setting radio button for Q1
            rbAnswer1Q1.setText(answer1Q1[0].toString());
            rbAnswer2Q1.setText(answer1Q1[1].toString());
            rbAnswer3Q1.setText(answer1Q1[2].toString());

            //setting radio button for Q2
            rbAnswer1Q2.setText(answer2Q2[0].toString());
            rbAnswer2Q2.setText(answer2Q2[1].toString());
            rbAnswer3Q2.setText(answer2Q2[2].toString());

            //setting radio button for Q3
            rbAnswer1Q3.setText(answer3Q3[0].toString());
            rbAnswer2Q3.setText(answer3Q3[1].toString());
            rbAnswer3Q3.setText(answer3Q3[2].toString());

            //setting radio button for Q4
            rbAnswer1Q4.setText(answer4Q4[0].toString());
            rbAnswer2Q4.setText(answer4Q4[1].toString());
            rbAnswer3Q4.setText(answer4Q4[2].toString());

            //setting radio button for Q4
            rbAnswer1Q5.setText(answer5Q5[0].toString());
            rbAnswer2Q5.setText(answer5Q5[1].toString());
            rbAnswer3Q5.setText(answer5Q5[2].toString());




        } else if(id ==3) {
            ImageView imag = (ImageView) findViewById(R.id.animl);
            imag.setImageResource(R.drawable.maths);
            String

                    mathQuetions[] = {"20 * 2 =?",
                    "4*5/2 =?",
                    "100-1+15 =?",
                    "55-40+1 =?",
                    "35 +10 =?"};

            String answer1Q1[] = {"40", "22", "30"};
            String answer2Q2[] = {"6", "15", "10"};
            String answer3Q3[] = {"114", "15", "200"};
            String answer4Q4[] = {"31", "21", "16"};
            String answer5Q5[] = {"45", "34", "22"};

            getSupportActionBar().setTitle("Math");

            txtQ1= (TextView)findViewById(R.id.textView);
            txtQ2= (TextView)findViewById(R.id.txtQuestion2);
            txtQ3= (TextView)findViewById(R.id.txtQuestion3);
            txtQ4= (TextView)findViewById(R.id.txtQuestion4);
            txtQ5= (TextView)findViewById(R.id.txtQuestion5);


            //radiobuttons for answer1
            RadioButton rbAnswer1Q1 = (RadioButton) findViewById(R.id.rdAnswer1Q1);
            RadioButton rbAnswer2Q1 = (RadioButton) findViewById(R.id.rdAnswer2Q1);
            RadioButton rbAnswer3Q1= (RadioButton) findViewById(R.id.rdAnswer3Q1);

            //radiobuttons for answer2
            RadioButton rbAnswer1Q2 = (RadioButton) findViewById(R.id.rdAnswer1Q2);
            RadioButton rbAnswer2Q2 = (RadioButton) findViewById(R.id.rdAnswer2Q2);
            RadioButton rbAnswer3Q2 = (RadioButton) findViewById(R.id.rdAnswer3Q2);

            //radiobuttons for answer3
            RadioButton rbAnswer1Q3 = (RadioButton) findViewById(R.id.rdAnswer1Q3);
            RadioButton rbAnswer2Q3 = (RadioButton) findViewById(R.id.rdAnswer2Q3);
            RadioButton rbAnswer3Q3 = (RadioButton) findViewById(R.id.rdAnswer3Q3);

            //radiobuttons for answer4
            RadioButton rbAnswer1Q4 = (RadioButton) findViewById(R.id.rdAnswer1Q4);
            RadioButton rbAnswer2Q4 = (RadioButton) findViewById(R.id.rdAnswer2Q4);
            RadioButton rbAnswer3Q4 = (RadioButton) findViewById(R.id.rdAnswer3Q4);

            //radiobuttons for answer5
            RadioButton rbAnswer1Q5 = (RadioButton) findViewById(R.id.rdAnswer1Q5);
            RadioButton rbAnswer2Q5 = (RadioButton) findViewById(R.id.rdAnswer2Q5);
            RadioButton rbAnswer3Q5 = (RadioButton) findViewById(R.id.rdAnswer3Q5);


            //setting the math question
            txtQ1.setText(mathQuetions[0]);
            txtQ2.setText(mathQuetions[1]);
            txtQ3.setText(mathQuetions[2]);
            txtQ4.setText(mathQuetions[3]);
            txtQ5.setText(mathQuetions[4]);

            //setting radio button for Q1
            rbAnswer1Q1.setText(answer1Q1[0].toString());//40
            rbAnswer2Q1.setText(answer1Q1[1].toString());
            rbAnswer3Q1.setText(answer1Q1[2].toString());

            //setting radio button for Q2
            rbAnswer1Q2.setText(answer2Q2[0].toString());
            rbAnswer2Q2.setText(answer2Q2[1].toString());
            rbAnswer3Q2.setText(answer2Q2[2].toString());//10

            //setting radio button for Q3
            rbAnswer1Q3.setText(answer3Q3[0].toString());
            rbAnswer2Q3.setText(answer3Q3[1].toString());//114
            rbAnswer3Q3.setText(answer3Q3[2].toString());

            //setting radio button for Q4
            rbAnswer1Q4.setText(answer4Q4[0].toString());
            rbAnswer2Q4.setText(answer4Q4[1].toString());
            rbAnswer3Q4.setText(answer4Q4[2].toString());//16

            //setting radio button for Q4
            rbAnswer1Q5.setText(answer5Q5[0].toString());//45
            rbAnswer2Q5.setText(answer5Q5[1].toString());
            rbAnswer3Q5.setText(answer5Q5[2].toString());

        }


    }



   public void questionOne(View view) {
        boolean checked = ((RadioButton) view).isChecked();
       //Check which radio button was clicked

       if ( id == 1 ) {

            switch (view.getId()) {
                case R.id.rdAnswer2Q1:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        } else if (id == 2) {
            switch (view.getId()) {
                case R.id.rdAnswer3Q1:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        }
        else if(id == 3) {
            switch (view.getId()) {
                case R.id.rdAnswer1Q1:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        }

    }


    //question 2
    public void questionTwo(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        if ( id == 1 ) {

            switch (view.getId()) {
                case R.id.rdAnswer2Q2:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        } else if (id == 2) {
            switch (view.getId()) {
                case R.id.rdAnswer1Q2:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        }
        else if(id == 3) {
            switch (view.getId()) {
                case R.id.rdAnswer3Q2:
                    if (checked) {
                        total = total + 1;

                        break;

                    }

            }
        }

    }

    // question 3
    public void questionThree(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        if (id == 1)
        switch (view.getId()) {
            case R.id.rdAnswer2Q3:
                if (checked) {
                    total = total + 1;

                    break;
            }
        } else if (id == 2) {
            switch (view.getId()) {
                case R.id.rdAnswer3Q3:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        }
        else if(id == 3) {
            switch (view.getId()) {
                case R.id.rdAnswer1Q3:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        }

    }

    // question 4
    public void questionFour(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        if (id == 1)
            switch (view.getId()) {
                case R.id.rdAnswer3Q4:
                    if (checked) {
                        total = total + 1;

                        break;

                    }
                    } else if (id == 2) {
                        switch (view.getId()) {
                            case R.id.rdAnswer2Q4:
                                if (checked) {
                                    total = total + 1;

                                    break;
                                }
                        }

                                } else if (id == 3) {
                                    switch (view.getId()) {
                                        case R.id.rdAnswer3Q4:
                                            if (checked) {
                                                total = total + 1;

                                                break;
                                            }

                                    }
                                }
                        }








    // question 5
    public void questionFive(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        if (id == 1)
            switch (view.getId()) {
                case R.id.rdAnswer1Q5:
                    if (checked) {
                        total = total + 1;

                        break;
            }

        } else if (id == 2) {
            switch (view.getId()) {
                case R.id.rdAnswer3Q5:
                    if (checked) {
                        total = total + 1;

                        break;
                    }

            }
        }
        else if(id == 3) {
            switch (view.getId()) {
                case R.id. rdAnswer1Q5:
                    if (checked) {
                        total = total + 1;
                        break;
                    }

            }
        }

    }

    public void btnSubmit(View v)
    {
       // wrongTotal = wrongTotal +countWrong;
        final AlertDialog.Builder builder = new AlertDialog.Builder(SecondActiviy.this);
        builder.setTitle("SCORE");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            // only for gingerbread and newer versions
            builder.setMessage(Html.fromHtml(" Out of 5 question you got <b>" + total + "</b> correct",Html.FROM_HTML_MODE_COMPACT));
        } else {
            builder.setMessage("Out of 5 question you got " + total + " correct");

        }
        builder.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                SecondActiviy.this.finish();

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }





}
