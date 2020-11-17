package userLoginA.example.userloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button clientBtn;
    private Button bOwnerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientBtn = (Button)findViewById(R.id.mainCustomerBtn);
        bOwnerBtn = (Button)findViewById(R.id.businessOwnBtn);

        clientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClientLoginPage();
            }
        });

        bOwnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBusinessLoginPage();
            }
        });
    }

    private void openBusinessLoginPage() {
        Intent intent = new Intent(this, BusinessLoginPageActivity.class);
        startActivity(intent);
    }

    private void openClientLoginPage() {
        Intent intent = new Intent(this, CustomerLoginPageActivity.class);
        startActivity(intent);
    }


}