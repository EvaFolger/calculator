package myapplication.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

//
//public class MainActivity extends AppCompatActivity {
//    private Calculator calculator;
//    private TextView text;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        int[] butt = new int[]{
//                R.id.one,
//                R.id.two,
//                R.id.three,
//                R.id.four,
//                R.id.five,
//                R.id.six,
//                R.id.seven,
//                R.id.eight,
//                R.id.nine,
//                R.id.zero
//        };
//        int[] act = new int[]{
//                R.id.minus,
//                R.id.plus,
//                R.id.equals,
//                R.id.multiply,
//                R.id.division
//        };
//
//        text = findViewById(R.id.text);
//        calculator=new Calculator();
//
//        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                calculator.onNumPressed(view.getId());
//                text.setText(calculator.getText());
//            }
//        };
//
//        View.OnClickListener actionButtonOnclickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                calculator.onActionPressed(view.getId());
//                text.setText(calculator.getText());
//            }
//        };
//        for(int i=0; i <butt.length; i++){
//            findViewById(butt[i]).setOnClickListener(numberButtonClickListener);
//        }
//        for (int i = 0; i < butt.length; i++) {
//            findViewById(butt[i]).setOnClickListener(actionButtonOnclickListener);
//        }
//        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                calculator.reset();
//                text.setText(calculator.getText());
//            }
//        });
//    }
//}
public class MainActivity extends AppCompatActivity {

    private Calculator calculator;

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] numberIds = new int[] {
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine
        };

        int[] actionsIds = new int[] {
                R.id.plus,
                R.id.minus,
                R.id.multiply,
                R.id.division,
                R.id.equals
        };

        text = findViewById(R.id.text);

        calculator = new Calculator();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onNumPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        View.OnClickListener actionButtonOnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onActionPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        for (int i = 0; i < numberIds.length; i++) {
            findViewById(numberIds[i]).setOnClickListener(numberButtonClickListener);
        }

        for (int i = 0; i < actionsIds.length; i++) {
            findViewById(actionsIds[i]).setOnClickListener(actionButtonOnclickListener);
        }

        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.reset();
                text.setText(calculator.getText());
            }
        });
    }
}
