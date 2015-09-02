package au.com.deangoddard_17822594.w6_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;



public class MainActivity extends AppCompatActivity {


    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ProgressBar progressBar;
        Button q1 = (Button)findViewById(R.id.but1);
        Button q2 = (Button)findViewById(R.id.but2);
        Button q3 = (Button)findViewById(R.id.but3);
        Button complete = (Button)findViewById(R.id.but4);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);




       q1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              // progressBar = (ProgressBar) findViewById(R.id.progressBar1);
                 progressBar.setProgress(25);

           }
       });


        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // progressBar = (ProgressBar) findViewById(R.id.progressBar1);
                progressBar.setProgress(50);

            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // progressBar = (ProgressBar) findViewById(R.id.progressBar1);
                progressBar.setProgress(75);

            }
        });

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // progressBar = (ProgressBar) findViewById(R.id.progressBar1);
                progressBar.setProgress(100);

            }
        });
    }




        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
