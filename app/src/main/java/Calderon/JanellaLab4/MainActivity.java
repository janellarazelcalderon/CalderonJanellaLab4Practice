package Calderon.JanellaLab4;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.net.URL;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itf","onCreate has executed..");
        Intent i = new Intent (this, MyService.class);
        startService(i);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf","onStart has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf","onResume has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","Tumakbo nga si onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf","onRestart is again executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","object is deallocated");
    }


    public void display(View v){
        //Toast.makeText(this,"Button is clicked..",Toast.LENGTH_LONG).show();
        Snackbar.make(v,"Snackbar is displayed",Snackbar.LENGTH_LONG).show();
    }

    public void display2(View v){
        Intent i = new Intent (this,Screen2.class);
        startActivity(i);

    }

    public void process(View v){
        Intent i = null, chooser = null;
        if (v.getId()==R.id.btnmap){
            i=new  Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i,"Select your map app");
            startActivity(chooser);
        }
    }

}
