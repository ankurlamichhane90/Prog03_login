package edu.vy4089qi.prog03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        final EditText loginUsername = (EditText)findViewById(R.id.usernameTxtBox);
        final EditText loginPassword = (EditText)findViewById(R.id.passwordTxtBox);

        Button btn = (Button)findViewById(R.id.loginBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginUsername.getText().toString().equals("GUEST") && loginPassword.getText().toString().equals("PASS"))
                    Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_LONG).show();

            }
        });
    }
    public void loadMenuLayout(View v1){
        setContentView(R.layout.main_menu);
    }
    public void loadConstraint(View v2){
        setContentView(R.layout.activity_main);
    }

}
