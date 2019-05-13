package com.example.ksuper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class db extends AppCompatActivity {
    DatabaseHelper db;
EditText e1,e2,e3;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
        db=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.password);
        e3=(EditText)findViewById(R.id.cpassword);
        b1=(Button)findViewById(R.id.tap);
b1.setOnClickListener(new View.OnClickListener()
{
@Override
    public void onClick(View v){
String a1= e1.getText().toString();
String a2= e2.getText().toString();
String a3= e3.getText().toString();
if(a1.equals("")|| a2.equals("")||a3.equals("")){
    Toast.makeText(getApplicationContext(),"feilds are empty",Toast.LENGTH_SHORT).show();
}
else{
    if(a2.equals(a3)){
         Boolean chkemail=db.chkemail(a1);
         if (chkemail==true){
             Boolean insert=db.insert(a1,a2);
             if(insert==true){
                 Toast.makeText(getApplicationContext(),"registered successfully",Toast.LENGTH_SHORT).show(); }
         }
    else{
Toast.makeText(getApplicationContext(),"email already exists",Toast.LENGTH_SHORT).show();



    }




    }
}


}

});



    }
}
