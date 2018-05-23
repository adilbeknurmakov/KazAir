//Authors: Adilbek Nurmakov & Aliya Kakimzhanova. For details visit  web app airkaz.org 
package com.example.kazair;
//kazair 
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.IconGenerator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.kazair.R.menu.menu_main;
import static java.lang.Math.round;


public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private Toolbar toolbar;
    public static String LOG_TAG2 = "====================================";
    public int savedLocation = 1;
    public int appearanceSet =0;


    int green = Color.parseColor("#22b622");
    int yellow = Color.parseColor("#fdff00");
    int orange = Color.parseColor("#ffb400");
    int red = Color.parseColor("#dd0000");
    int purple = Color.parseColor("#a316b4");
    int brown = Color.parseColor("#a90000");
    static Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
        new ParseTaskAstana().execute();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            }
        }, 0, 10000);


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.menu_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkLocationPermission();
        }

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onMapReady(final GoogleMap googleMap) {
	p
        mMap = googleMap;

        Log.d(LOG_TAG2, String.valueOf(savedLocation));
        if(savedLocation==1) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(51.150657, 71.434039)));
        } else if(savedLocation==2){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.238949, 76.889709)));
        } else if(savedLocation==3){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.8333333333, 73.1666666667)));
        }
        LatLng miras = new LatLng(51.15200000, 71.48600000);

        ArrayList<IconGenerator> icons = new ArrayList<>();
        ArrayList<MarkerOptions> markers = new ArrayList<>();

        IconGenerator iF_ast1 = new IconGenerator(this);
        IconGenerator iF_ast2 = new IconGenerator(this);
        IconGenerator iF_ast3 = new IconGenerator(this);
        IconGenerator iF_ast4 = new IconGenerator(this);
        IconGenerator iF_ast5 = new IconGenerator(this);

        IconGenerator iF_alm1 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm2 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm3 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm4 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm5 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm6 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm7 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm8 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm9 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm10 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm11 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm12 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm13 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm14 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm15 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm16 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm17 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm18 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm19 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm20 = new IconGenerator(getApplicationContext());

        IconGenerator iF_alm21 = new IconGenerator(getApplicationContext());
        IconGenerator iF_alm22 = new IconGenerator(getApplicationContext());


        icons.add(iF_ast1);
        icons.add(iF_ast2);
        icons.add(iF_ast3);
        icons.add(iF_ast4);
        icons.add(iF_ast5);

        icons.add(iF_alm1);
        icons.add(iF_alm2);
        icons.add(iF_alm3);
        icons.add(iF_alm4);
        icons.add(iF_alm5);
        icons.add(iF_alm6);
        icons.add(iF_alm7);
        icons.add(iF_alm8);
        icons.add(iF_alm9);
        icons.add(iF_alm10);
        icons.add(iF_alm11);
        icons.add(iF_alm12);
        icons.add(iF_alm13);
        icons.add(iF_alm14);
        icons.add(iF_alm15);
        icons.add(iF_alm16);
        icons.add(iF_alm17);
        icons.add(iF_alm18);
        icons.add(iF_alm19);
        icons.add(iF_alm20);
        icons.add(iF_alm21);
        icons.add(iF_alm22);

    for (int k = 0; k < icons.size(); k++) {
        if(ParseTaskAstana.all_sensors.get(k)!=-1){
        icons.get(k).setTextAppearance(R.style.iconGenText);
        }
        else{
            icons.get(k).setTextAppearance(R.style.iconGenText2);

        }
    }

        MarkerOptions markerOptions31 = new MarkerOptions();
        MarkerOptions markerOptions32 = new MarkerOptions();
        MarkerOptions markerOptions33 = new MarkerOptions();
        MarkerOptions markerOptions34 = new MarkerOptions();
        MarkerOptions markerOptions35 = new MarkerOptions();

        MarkerOptions markerOptions1 = new MarkerOptions();
        MarkerOptions markerOptions2 = new MarkerOptions();
        MarkerOptions markerOptions3 = new MarkerOptions();
        MarkerOptions markerOptions4 = new MarkerOptions();
        MarkerOptions markerOptions5 = new MarkerOptions();
        MarkerOptions markerOptions6 = new MarkerOptions();
        MarkerOptions markerOptions7 = new MarkerOptions();
        MarkerOptions markerOptions8 = new MarkerOptions();
        MarkerOptions markerOptions9 = new MarkerOptions();
        MarkerOptions markerOptions10 = new MarkerOptions();
        MarkerOptions markerOptions11 = new MarkerOptions();
        MarkerOptions markerOptions12 = new MarkerOptions();
        MarkerOptions markerOptions13 = new MarkerOptions();
        MarkerOptions markerOptions14 = new MarkerOptions();
        MarkerOptions markerOptions15 = new MarkerOptions();
        MarkerOptions markerOptions16 = new MarkerOptions();
        MarkerOptions markerOptions17 = new MarkerOptions();
        MarkerOptions markerOptions18 = new MarkerOptions();
        MarkerOptions markerOptions19 = new MarkerOptions();
        MarkerOptions markerOptions20 = new MarkerOptions();

        MarkerOptions markerOptions21 = new MarkerOptions();
        MarkerOptions markerOptions22 = new MarkerOptions();


        markers.add(markerOptions31);
        markers.add(markerOptions32);
        markers.add(markerOptions33);
        markers.add(markerOptions34);
        markers.add(markerOptions35);

        markers.add(markerOptions1);
        markers.add(markerOptions2);
        markers.add(markerOptions3);
        markers.add(markerOptions4);
        markers.add(markerOptions5);
        markers.add(markerOptions6);
        markers.add(markerOptions7);
        markers.add(markerOptions8);
        markers.add(markerOptions9);
        markers.add(markerOptions10);
        markers.add(markerOptions11);
        markers.add(markerOptions12);
        markers.add(markerOptions13);
        markers.add(markerOptions14);
        markers.add(markerOptions15);
        markers.add(markerOptions16);
        markers.add(markerOptions17);
        markers.add(markerOptions18);
        markers.add(markerOptions19);
        markers.add(markerOptions20);

        markers.add(markerOptions21);
        markers.add(markerOptions22);

            setColor(icons);
            for (int y = 0; y < icons.size(); y++) {
                if(ParseTaskAstana.all_sensors.get(y)!=-1) {
                    markers.get(y).icon(BitmapDescriptorFactory.fromBitmap(icons.get(y).makeIcon(String.valueOf(ParseTaskAstana.all_sensors.get(y)))))
                            .visible(true);
                } else
                {
                    markers.get(y).icon(BitmapDescriptorFactory.fromBitmap(icons.get(y).makeIcon("No data")))
                            .visible(true);
                }

            }


        markerOptions31.position(new LatLng(51.16200000, 71.42300000));
        markerOptions32.position(miras);
        markerOptions33.position(new LatLng(51.12500000, 71.47200000));
        markerOptions34.position(new LatLng(51.17900000, 71.37600000));
        markerOptions35.position(new LatLng(51.13200000, 71.41300000));

        markerOptions1.position(new LatLng(43.31300000,76.93900000));
        markerOptions2.position(new LatLng(43.22400000,76.93800000));
        markerOptions3.position(new LatLng(43.24000000,76.87400000));
        markerOptions4.position(new LatLng(43.26500000,76.97300000));
        markerOptions5.position(new LatLng(43.25300000,76.91000000));
        markerOptions6.position(new LatLng(43.21400000,76.89300000));
        markerOptions7.position(new LatLng(43.29600000,76.84400000));
        markerOptions8.position(new LatLng(43.25400000,76.82000000));
        markerOptions9.position(new LatLng(43.17400000,76.91700000));
        markerOptions10.position(new LatLng(43.24800000,76.94900000));
        markerOptions11.position(new LatLng(43.18900000,76.86800000));
        markerOptions12.position(new LatLng(43.17700000,76.96600000));
        markerOptions13.position(new LatLng(43.26900000,76.94400000));
        markerOptions14.position(new LatLng(43.21600000,76.84800000));
        markerOptions15.position(new LatLng(43.23100000,76.75400000));
        markerOptions16.position(new LatLng(43.39700000,77.02700000));
        markerOptions17.position(new LatLng(43.19500000,76.91500000));
        markerOptions18.position(new LatLng(43.17200000,76.73600000));
        markerOptions19.position(new LatLng(43.36900000,76.98700000));
        markerOptions20.position(new LatLng(43.33700000,76.90400000));

        markerOptions21.position(new LatLng(49.80000000,73.08900000));
        markerOptions22.position(new LatLng(49.78100000,73.13800000));



        for(int v=0; v<icons.size();v++){
            mMap.addMarker(markers.get(v)).showInfoWindow();
        }


        TextView textView =  (TextView) findViewById(R.id.textV);
        TextView textView2 =  (TextView) findViewById(R.id.textView);
        if(savedLocation==1) {
            textView.setText(""+(int) avgAst());
            textView2.setText(""+polution((int) avgAst()));
            setBoxColor(textView,(int)avgAst());
        }else if(savedLocation==2){
            textView.setText(""+(int) avgAlm());
            textView2.setText(""+polution((int) avgAlm()));
            setBoxColor(textView,(int)avgAlm());
        } else if(savedLocation==3){
            textView.setText(""+(int) avgKar());
            textView2.setText(""+polution((int) avgKar()));
            setBoxColor(textView,(int)avgKar());
        }


//        circle = mMap.addCircle(new CircleOptions()
//                .center(new LatLng(51.15200000, 71.48600000))
//                .radius(2000)
//                .strokeWidth(2)
//                .strokeColor(0x3399ccff)
//                .fillColor(Color.argb(77, 219, 87, 87))
//                .clickable(true));
//
//        circle = mMap.addCircle(new CircleOptions()
//                .center(new LatLng(51.16200000, 71.42300000))
//                .radius(2000)
//                .strokeWidth(2)
//                .strokeColor(0x3399ccff)
//                .fillColor(Color.argb(77, 219, 87, 87))
//                .clickable(true));
//        circle = mMap.addCircle(new CircleOptions()
//                .center(new LatLng(51.12500000, 71.47200000))
//                .radius(2000)
//                .strokeWidth(2)
//                .strokeColor(0x3399ccff)
//                .fillColor(Color.argb(77, 219, 87, 87))
//                .clickable(true));
//        circle = mMap.addCircle(new CircleOptions()
//                .center(new LatLng(51.13200000, 71.41300000))
//                .radius(2000)
//                .strokeWidth(2)
//                .strokeColor(0x3399ccff)
//                .fillColor(Color.argb(77, 219, 87, 87))
//                .clickable(true));

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                mMap.setMyLocationEnabled(true);
            }
        } else {
            mMap.setMyLocationEnabled(true);
        }

    }
    public double avgAst(){
        double average=0;
        int working=0;
        for(int j=0; j<ParseTaskAstana.ast_sensors.size(); j++){
            if(ParseTaskAstana.ast_sensors.get(j)!=-1){
                average+=ParseTaskAstana.ast_sensors.get(j);
                working++;
            }
        }

        return round(average/working);
    }
    public double avgAlm(){
        double average=0;
        int working=0;
        for(int j=0; j<ParseTaskAstana.alm_sensors.size(); j++){
            if(ParseTaskAstana.alm_sensors.get(j)!=-1){
                average+=ParseTaskAstana.alm_sensors.get(j);
                working++;
            }
        }

        return round(average/working);
    }
    public double avgKar(){
        double average=0;
        int working=0;
        for(int j=0; j<ParseTaskAstana.kar_sensors.size(); j++){
            if(ParseTaskAstana.kar_sensors.get(j)!=-1){
                average+=ParseTaskAstana.kar_sensors.get(j);
                working++;
            }
        }

        return round(average/working);
    }
    public String polution(int score){
        String polution ="";
        String good ="Good";
        String moderate = "moderate";
        String unhealthy_sg = "unhealthy for sensitive groups";
        String unhealthy = "unhealthy";
        String v_unhealthy = "very unhealthy";
        String hazardous = "hazardous";

        if(score>=0 && score<50){
           polution = good;
        }
        if(score>=50 && score<100){
            polution = moderate;
        }
        if(score>=100 && score<150){
            polution = unhealthy_sg;
        }
        if(score>=150 && score<200){
            polution = unhealthy;
        }
        if(score>=200 && score<250){
            polution = v_unhealthy;
        }
        if(score>250 ){
            polution = hazardous;
        }
        return polution;

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void setBoxColor(TextView textview, int score){

        if(score>=0 && score<50){
            textview.setBackgroundColor(green);
        }
        if(score>=50 && score<100){
            textview.setBackgroundColor(yellow);
        }
        if(score>=100 && score<150){
            textview.setBackgroundColor(orange);
        }
        if(score>=150 && score<200){
            textview.setBackgroundColor(red);
        }
        if(score>=200 && score<250){
            textview.setBackgroundColor(purple);
        }
        if(score>250 ){
            textview.setBackgroundColor(brown);
        }

    }
    public void setColor(ArrayList<IconGenerator> icons){
        for(int i=0; i<icons.size(); i++){
            if(ParseTaskAstana.all_sensors.get(i)>=0 && ParseTaskAstana.all_sensors.get(i)<50){
                icons.get(i).setColor(green);
            }
            if(ParseTaskAstana.all_sensors.get(i)>=50 && ParseTaskAstana.all_sensors.get(i)<100){
                icons.get(i).setColor(yellow);
            }
            if(ParseTaskAstana.all_sensors.get(i)>=100 && ParseTaskAstana.all_sensors.get(i)<150){
                icons.get(i).setColor(orange);
            }
            if(ParseTaskAstana.all_sensors.get(i)>=150 && ParseTaskAstana.all_sensors.get(i)<200){
                icons.get(i).setColor(red);
            }
            if(ParseTaskAstana.all_sensors.get(i)>=200 && ParseTaskAstana.all_sensors.get(i)<250){
                icons.get(i).setColor(purple);
            }
            if(ParseTaskAstana.all_sensors.get(i)>=250){
                icons.get(i).setColor(brown);
            }
        }
    }

    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;

    public boolean checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);

            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay!
                    if (ActivityCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        mMap.setMyLocationEnabled(true);
                    }
                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Toast.makeText(this, "permission denied", Toast.LENGTH_LONG).show();
                }
                return;
            }

        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, Main3Activity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_Astana) {
            savedLocation=1;
            TextView textView =  (TextView) findViewById(R.id.textV);
            TextView textView2 =  (TextView) findViewById(R.id.textView);
            textView.setText(""+(int) avgAst());
            textView2.setText(""+polution((int) avgAst()));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(51.143261, 71.443785)));
            return true;
        }
        if (id == R.id.action_Almaty) {
            savedLocation=2;
            TextView textView =  (TextView) findViewById(R.id.textV);
            TextView textView2 =  (TextView) findViewById(R.id.textView);
            textView.setText(""+(int) avgAlm());
            textView2.setText(""+polution((int) avgAlm()));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.238949, 76.889709)));
            return true;
        }
        if (id == R.id.action_Karaganda) {
            savedLocation=3;
            TextView textView =  (TextView) findViewById(R.id.textV);
            TextView textView2 =  (TextView) findViewById(R.id.textView);
            textView.setText(""+(int) avgKar());
            textView2.setText(""+polution((int) avgKar()));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.8333333333, 73.1666666667)));
            return true;
        }
        if (id == R.id.action_refresh) {
            appearanceSet=1;
            mMap.clear();
            onMapReady(mMap);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(menu_main, menu);
        return true;
    }



}
