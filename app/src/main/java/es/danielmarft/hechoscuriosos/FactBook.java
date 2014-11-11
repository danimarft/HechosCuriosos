package es.danielmarft.hechoscuriosos;

import android.content.res.Resources;

import java.util.Random;

/**
 * Created by AlumnoT on 28/10/2014.
 */


public class FactBook {
    private Random al;
    private String[]resp;
    private String auxresp;
    public String  getRandomFact(Resources res)
    {


        int longit=0;
        resp = res.getStringArray(R.array.resp);

        al = new Random();


        longit=resp.length;

        auxresp=resp[al.nextInt(longit)];

        return(auxresp);

    }
}
