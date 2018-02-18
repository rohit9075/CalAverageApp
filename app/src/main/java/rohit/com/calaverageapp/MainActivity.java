package rohit.com.calaverageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private EditText mEditTextFirstNumber, mEditTextSecondNumber, mEditTextThirdNumber;
    private TextView mTextViewAverage;
    private Button mButtonAverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEditTextFirstNumber = (EditText)findViewById(R.id.editText_first_number);
        mEditTextSecondNumber = (EditText)findViewById(R.id.editText_second_number);
        mEditTextThirdNumber = (EditText)findViewById(R.id.editText_third_number);


        mTextViewAverage = (TextView)findViewById(R.id.textView_average);

        mEditTextThirdNumber.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ((event.getAction()==KeyEvent.ACTION_DOWN)&& (keyCode == KeyEvent.KEYCODE_ENTER)){


                    int firstNumber = Integer.parseInt(mEditTextFirstNumber.getText().toString());
                    int SecondNumber =Integer.parseInt(mEditTextSecondNumber.getText().toString());
                    int ThirdNumber =Integer.parseInt(mEditTextThirdNumber.getText().toString());

                    int  result = (firstNumber + SecondNumber + ThirdNumber)/3;

                    mTextViewAverage.setText(String.valueOf(result));
                    return true;
                }
                return false;
            }
        });



    }
}
