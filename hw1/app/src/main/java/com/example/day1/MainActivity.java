package com.example.day1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final EditText y = findViewById(R.id.editText1);
         final EditText x = findViewById(R.id.editText2);
         final EditText C = findViewById(R.id.editText3);
         final EditText a = findViewById(R.id.editText4);
         final Button b = findViewById(R.id.button1);
         final Button d = findViewById(R.id.button2);
        final TextView q = findViewById(R.id.textView);


                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double Quizes = Double.parseDouble(y.getText().toString());
                        double homework = Double.parseDouble(x.getText().toString());
                        double  midterms = Double.parseDouble(C.getText().toString());
                        double  finall  = Double.parseDouble(a.getText().toString());
                        final double grade = (Quizes + homework + midterms + finall);

                        if (grade >= 90){
                            q.setTextColor(Color.BLUE);
                            q.setText (" A ");
                        }
                        else if ( grade >= 80 ){
                            q.setTextColor(Color.RED);
                            q.setText(" B ");
                        }
                         else if ( grade >= 70 ){
                            q.setTextColor(Color.BLACK);
                            q.setText   (" C ");
                        }
                         else if (grade >= 60){
                            q.setTextColor(Color.GRAY);
                            q.setText   (" d " );
                        }
                          else{
                            q.setTextColor(Color.YELLOW);
                            q.setText (" F ");
                        }

            }
         });
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y.setText("");
                        x.setText("");
                        C.setText("");
                        a.setText("");
                        q.setText("");

                    }



                });

    }






}
