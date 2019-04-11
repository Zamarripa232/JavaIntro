package us.floydasaur.javaintro;

/**
 * This is the challenge or maybe required component of
 * LambdaSchool Intro to Android Dev, Day 2
 * Java_Introduction
 * Which is a port of code originally written at repl.it
 * original code can be found here: https://repl.it/student/submissions/6349576
 * @author Floyd Zamarripa
 * @version 1.0 4-11-19
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText inputIntA;
    EditText inputIntB;
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonStart = findViewById(R.id.button_start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ensure text is cleared on each click.
                textView = findViewById(R.id.textview_results);
                textView.setText("");

                // Find inputs, get text as string, convert to int.
                inputIntA = findViewById(R.id.input_int_a);
                inputIntB = findViewById(R.id.input_int_b);


                // Run the exercise functions, but only if input boxes aren't empty.
                if (!inputIntA.getText().toString().isEmpty() && !inputIntB.getText().toString().isEmpty()){
                    int x = Integer.parseInt(inputIntA.getText().toString());
                    int y = Integer.parseInt(inputIntB.getText().toString());
                    startAppend(x,y);
                } else {
                    textView.setText("Integers required to start.");
                }
            }
        });
        
    }

    // Swapped the voids for the appropriate data types
    // and swapped the prints for returns.
    public void startAppend(int x, int y) {
        textView = findViewById(R.id.textview_results);
        textView.append(E1(x) + "\n");
        textView.append(E2A() + "\n");
        textView.append(E2B() + "\n");
        textView.append(E2C() + "\n");
        textView.append(E2D() + "\n");
        textView.append(E2E() + "\n");
        textView.append(E3() + "\n");
        textView.append(E4A(x, y) + "\n");
        textView.append(E4B(x, y) + "\n");
        textView.append(E4C(x, y) + "\n");
        textView.append(E4D(x, y) + "\n");
    }
    public static int E1(int z) {
        // Exercise 1: declare a data member, assign it the value of z and print it to the screen.
        int numUno = z;
        return numUno;
    }

    // Exercise 2: print the results
    public static int E2A() {
        // Assign an int the value of 9000 and add 1 to it
        int exerIntA = 9000;
        return exerIntA + 1;
    }

    public static byte E2B() {
        // Assign a byte the value of 127 increment it
        byte exerByte = 127;
        return ++exerByte;
    }

    public static int E2C() {
        // Assign an int the value of 5 and divide it by 2
        int exerIntC = 5;
        return exerIntC / 2;
    }


    public static float E2D() {
        // Assign a float the value of 5 and divide it by 2
        float exerFloat = 5;
        return exerFloat / 2;
    }

    public static int E2E() {
        // Print the result of 5 modulo 2
        return 5%2;
    }

    // Exercise 3 work with post/pre increment and decrement
    public static String E3() {
        // Write code that creates the following output using only increment and decrement operators
        /*
        126
        127
        -127
        -127
        127
        127
        -127
        */
        // print result of every calculation
        // (can assign a value when the variable is declared)
        byte x = 126;
        String result = "";   //  Result:
        result += x++ + "\n"; //  126 to  127
        result += x++ + "\n"; //  127 to -128
        result += ++x + "\n"; // -128 to -127
        result += x-- + "\n"; // -127 to -128
        result += --x + "\n"; // -128 to  127
        result += x++ + "\n"; //  127 to -128
        result += --x;        // -128 to -127
        return result;
    }

    // Exercise 4 arithmetic operations
    public static int E4A(int x, int y) {
        // Add x and y together and print the result
        x += y;
        return x;
    }

    public static int E4B(int x, int y) {
        // Subtract y from x and print the result
        x -= y;
        return x;
    }

    public static int E4C(int x, int y) {
        // Multiply x and y and print the result
        x *= y;
        return x;
    }

    public static int E4D(int x, int y) {
        // Divide y into x and print the result (x divided by y)
        x /= y;
        return x;
    }
}