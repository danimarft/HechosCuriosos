package es.danielmarft.hechoscuriosos;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.res.Resources;
import java.util.Random;


public class MyActivity extends ActionBarActivity {

    FactBook fb = new FactBook();
    ColorWheel cw = new ColorWheel();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        //declare our View variables and assign the Views from the layout file


        /*View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the button was clicked
                //so we update the factLabel with a new Fact
            }
        }
        showFactButton.setOnClickListener(listener);*/

    }

    public void factButtonAction(View v)
    {


        TextView factLabel = (TextView)findViewById(R.id.HechoCuriosoTextView);

        factLabel.setText(fb.getRandomFact(getResources()));

        changeBackgroundColor();



     }
    public void changeBackgroundColor()
    {
        Button showFactButton =(Button) findViewById(R.id.button);
        RelativeLayout rl =(RelativeLayout) findViewById(R.id.relativeLayout);

        rl.setBackgroundColor(Color.parseColor(cw.getRandomColor(getResources())));
        showFactButton.setTextColor(Color.parseColor(cw.getRandomColor(getResources())));

    }
    //no los borro porque me daba problemas al quitar el action bar y lo tuve que dejar

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
