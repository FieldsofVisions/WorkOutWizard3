package comfieldsofvisions.google.httpssites.workoutwizard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Intent i = getIntent();
        String previousActivity = i.getExtras().getString("callingActivity");

        TextView textView = (TextView)findViewById(R.id.tv1);
        textView.setText(previousActivity);

        Button button = (Button)findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.et1);
               String userName = String.valueOf(editText);
                Intent sendNameBack= new Intent(userName);
                sendNameBack.putExtra("UserName", userName);
                setResult(RESULT_OK, sendNameBack);
                finish();
            }
        });

    }

}
