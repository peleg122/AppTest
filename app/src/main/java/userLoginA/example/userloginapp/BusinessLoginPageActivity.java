package userLoginA.example.userloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessLoginPageActivity extends AppCompatActivity {

    private Button newBusinessRegBtn;
    private Button loginToBusinessBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_login_page);

        newBusinessRegBtn = (Button) findViewById(R.id.businessRegisterBtn);
        loginToBusinessBtn = (Button) findViewById(R.id.businessLoginBtn);

        newBusinessRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBusinessRegistrationPage();
            }
        });

        loginToBusinessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TO-DO
            }
        });

    }

    private void openBusinessRegistrationPage() {

        Intent intent = new Intent(this, BusinessRegistrationPageActivity.class);
        startActivity(intent);

    }
}