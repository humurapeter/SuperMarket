package com.example.ksuper;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class superf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superf);
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
                Intent h4= new Intent(superf.this,fragment_supermarket.class);
                startActivity(h4);
                break;




            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }

}






