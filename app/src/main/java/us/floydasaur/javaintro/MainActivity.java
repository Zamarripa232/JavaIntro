package us.floydasaur.javaintro;

/**
 * This is the challenge or maybe required component of
 * LambdaSchool Intro to Android Dev, Day 2
 * Java_Introduction
 * Which is a port of code originally written at repl.it
 * original code can be found here: https://repl.it/student/submissions/6349576
 * @author Floyd Zamarripa
 * @version 0.1 4-10-19
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// Append the text and not replace the text in the textview.