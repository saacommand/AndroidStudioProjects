package philipng.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPlus;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnClear;
    private EditText operand1;
    private EditText operand2;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int num1;
        int num2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnPlus = (Button) findViewById(R.id.plus);
        btnSubtract = (Button) findViewById(R.id.subtract);
        btnDivide = (Button) findViewById(R.id.divide);
        btnMultiply = (Button) findViewById(R.id.multiply);
        btnClear = (Button) findViewById(R.id.btnClear);
        operand1 = (EditText) findViewById(R.id.value1);
        operand2 = (EditText) findViewById(R.id.value2);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && operand2.length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please enter numbers into both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && operand2.length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please enter numbers into both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && operand2.length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please enter numbers into both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && operand2.length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                Toast.makeText(MainActivity.this, "Please enter numbers into both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();
            }
        });


/*
FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
fab.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
.setAction("Action", null).show();
}
});
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
