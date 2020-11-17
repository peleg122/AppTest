package userLoginA.example.userloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerLoginPageActivity extends AppCompatActivity {

    private Button customerRegisterBtn;
    private Button customerLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_page);

        customerLoginBtn = (Button)findViewById(R.id.customerLoginBtn);
        customerRegisterBtn = (Button) findViewById(R.id.registerBtn);

        customerRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClientRegistrationPage();
            }
        });

        customerLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void openClientRegistrationPage() {

        Intent intent = new Intent(this, CustomerRegisterPageActivity.class);
        startActivity(intent);

    }
}