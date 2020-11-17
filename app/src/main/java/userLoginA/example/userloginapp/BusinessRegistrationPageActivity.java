package userLoginA.example.userloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class BusinessRegistrationPageActivity extends Activity {

    private Button registerNewBusinessBtn;
    EditText businessName;
    EditText businessOwnerName;
    EditText businessEmail;
    EditText businessPassword;
    EditText businessRetypePassword;
    EditText businessPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_registration_page);


        businessName = (EditText) findViewById(R.id.editTextBusinessNameReg) ;
        businessOwnerName = (EditText) findViewById(R.id.editTextBusinessOwnerName) ;
        businessEmail = (EditText) findViewById(R.id.editTextBusinessEmailAddress);
        businessPassword =(EditText) findViewById(R.id.editTextBusinessPasswordReg) ;
        businessRetypePassword = (EditText) findViewById(R.id.editTextBusinessPasswordRegRetype);
        businessPhoneNumber = (EditText) findViewById(R.id.editTextBusinessPhoneReg) ;


        registerNewBusinessBtn = (Button) findViewById(R.id.registerBusinessHereBtn);
        registerNewBusinessBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //link all new business input to firebase
                Context context = getApplicationContext();
                Toast.makeText(context, businessName.getText().toString() + "\n"+
                        businessOwnerName.getText().toString()+"\n"+
                        businessEmail.getText().toString()+"\n"+
                        businessPassword.getText().toString()+"\n"+
                        businessRetypePassword.getText().toString()+"\n"+
                        businessPhoneNumber.getText().toString()+"\n", Toast.LENGTH_SHORT).show();
            }
        });
    }
}