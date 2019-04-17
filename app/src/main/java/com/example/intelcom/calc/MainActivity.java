package com.example.intelcom.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText xInput;
    private EditText yInput;
    private Button sumbutton, subtractbutton, multiplybutton, divisionbutton,
            binarybutton, modbutton, xorbutton;

    public Boolean indicator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xInput = findViewById(R.id.x);
        yInput = findViewById(R.id.y);



        sumbutton = findViewById(R.id.sumbutton);
        sumbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                  int a = GetIntegerSum(Integer.valueOf(xInput.getText().toString()),Integer.valueOf(yInput.getText().toString()));
                  String result = Integer.toString(a);
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(result);
                }else {String a = GetBinarySum(xInput.getText().toString(), yInput.getText().toString());
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(a);}
            }
        });
        subtractbutton = findViewById(R.id.subtractbutton);
        subtractbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                    int a = GetIntegerDiff(Integer.valueOf(xInput.getText().toString()),Integer.valueOf(yInput.getText().toString()));
                    String result = Integer.toString(a);
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(result);
                }else {String a = GetBinaryDiff(xInput.getText().toString(), yInput.getText().toString());
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(a);}
            }
        });

        multiplybutton = findViewById(R.id.multiplybutton);
        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                    int a = GetIntegerProd(Integer.valueOf(xInput.getText().toString()),Integer.valueOf(yInput.getText().toString()));
                    String result = Integer.toString(a);
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(result);
                }else {String a = GetBinaryProd(xInput.getText().toString(), yInput.getText().toString());
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(a);}
            }
        });

        divisionbutton = findViewById(R.id.divisionbutton);
        divisionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                    int a = GetIntegerQuotient(Integer.valueOf(xInput.getText().toString()),Integer.valueOf(yInput.getText().toString()));
                    String result = Integer.toString(a);
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(result);
                }else {String a = GetBinaryQuotient(xInput.getText().toString(), yInput.getText().toString());
                        TextView resulty = findViewById(R.id.result);
                        resulty.setText(a);}

            }
        });

        modbutton = findViewById(R.id.modbutton);
        modbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                    int a = GetIntegerModule(Integer.valueOf(xInput.getText().toString()),Integer.valueOf(yInput.getText().toString()));
                    String result = Integer.toString(a);
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(result);
                }else {String a = GetBinaryModule(xInput.getText().toString(), yInput.getText().toString());
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(a);}
            }
        });

        xorbutton = findViewById(R.id.xorbutton);
        xorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                    int a = GetIntegerXOR(Integer.valueOf(xInput.getText().toString()),Integer.valueOf(yInput.getText().toString()));
                    String result = Integer.toString(a);
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(result);
                }else {String a = GetBinaryXOR(xInput.getText().toString(), yInput.getText().toString());
                    TextView resulty = findViewById(R.id.result);
                    resulty.setText(a);}
            }
        });

        binarybutton = findViewById(R.id.binarybutton);
        binarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!indicator){
                    sumbutton.setText(getString(R.string.XandY));
                    subtractbutton.setText(getString(R.string.xorybutt));
                    multiplybutton.setText(getString(R.string.noxbutt));
                    indicator = true;
                }else{sumbutton.setText(getString(R.string.sumbutton));
                      subtractbutton.setText(getString(R.string.subtractbutton));
                      multiplybutton.setText(getString(R.string.multiplybutton));
                      indicator = false;}
            }
        });

    }

    public int GetIntegerSum(int a, int b){
        return a + b;
    }
    public int GetIntegerDiff(int a, int b){
        return a - b;
    }
    public int GetIntegerProd(int a, int b){
        return a * b;
    }
    public int GetIntegerQuotient(int a, int b){
        return a / b;
    }
    public int GetIntegerModule(int a, int b){
        return a % b;
    }

    public int GetIntegerXOR(int a, int b){
        return a ^ b;
    }

    public String GetBinarySum(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int sum = left + right;
        return Integer.toBinaryString(sum);
    }

    public String GetBinaryDiff(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int diff = left - right;
        return Integer.toBinaryString(diff);
    }

    public String GetBinaryProd(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int prod = left * right;
        return Integer.toBinaryString(prod);
    }

    public String GetBinaryQuotient(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int quotient = left / right;
        return Integer.toBinaryString(quotient);
    }

    public String GetBinaryModule(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b,2);
        int module = left%right;
        return Integer.toBinaryString(module);
    }

    public String GetBinaryXOR(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b,2);
        int xor = left^right;
        return Integer.toBinaryString(xor);
    }
}
