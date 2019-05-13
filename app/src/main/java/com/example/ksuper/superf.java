package com.example.ksuper;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
//HUMURANKWINE PETER
//2017/BIT/083/PS

public class superf extends AppCompatActivity {
Button Navg;
Button ee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superf);
        Navg=findViewById(R.id.navg);
        Navg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(superf.this, navigation.class);
                startActivity(myintent);}



        });
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int x = item.getItemId();
        switch (x) {
            case R.id.itemone:
                Intent h = new Intent(superf.this, superf.class);
                startActivity(h);
                break;
            case R.id.itemtwo:
                Intent h1 = new Intent(superf.this, supert.class);
                startActivity(h1);
                break;

            case R.id.itemthree:
                Intent h3= new Intent(superf.this,explore.class);
                startActivity(h3);
                break;
            case R.id.view:
                Intent h2= new Intent(superf.this,MainActivity.class);
                startActivity(h2);
                break;
            case R.id.frag:
                Intent h4= new Intent(superf.this,Notify.class);
                startActivity(h4);
                break;

            case R.id.reg:
                Intent h5= new Intent(superf.this,db.class);
                startActivity(h5);
                break;




            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }

}






