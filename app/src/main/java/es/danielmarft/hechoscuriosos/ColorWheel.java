package es.danielmarft.hechoscuriosos;

import android.content.res.Resources;
import android.graphics.Color;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

/**
 * Created by AlumnoT on 28/10/2014.
 */
public class ColorWheel {
    private Random al2;
    private String[]col;
    private String auxcol;



    public String  getRandomColor(Resources res)
    {


        int longitud=0;
        col = res.getStringArray(R.array.col);

        al2 = new Random();


        longitud=col.length;

        auxcol=col[al2.nextInt(longitud)];
      //auxcol = Color.parseColor(auxcol);
        return((auxcol));

    }

}
