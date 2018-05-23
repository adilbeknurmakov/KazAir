//Author Adilbek Nurmakov  For details visit  web app airkaz.org
package com.example.kazair;
//kazAir 
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** reference
 * http://androiddocs.ru/parsing-json-poluchaem-i-razbiraem-json-s-vneshnego-resursa/
 */

public class ParseTaskAstana extends AsyncTask<Void, Void, String> {
    public static String LOG_TAG = "my_log";
    HttpURLConnection urlConnection = null;
    BufferedReader reader = null;
    String resultJson = "";
    public static int sen1Ast = 0;
    public static int sen2ast = 0;
    public static int sen3ast = 0;
    public static int sen4ast = 0;
    public static int sen5ast = 0;


    public static int sen1alm = 0;
    public static int sen2alm = 0;
    public static int sen3alm = 0;
    public static int sen4alm = 0;
    public static int sen5alm = 0;
    public static int sen6alm = 0;
    public static int sen7alm = 0;
    public static int sen8alm = 0;
    public static int sen9alm = 0;
    public static int sen10alm = 0;
    public static int sen11alm = 0;
    public static int sen12alm = 0;
    public static int sen13alm = 0;
    public static int sen14alm = 0;
    public static int sen15alm = 0;
    public static int sen16alm = 0;
    public static int sen17alm = 0;
    public static int sen18alm = 0;
    public static int sen19alm = 0;
    public static int sen20alm = 0;

    public static int sen21kar = 0;
    public static int sen22kar = 0;

    public static ArrayList<Integer> ast_sensors = new ArrayList<>();
    public static ArrayList<Integer> alm_sensors = new ArrayList<>();
    public static ArrayList<Integer> all_sensors = new ArrayList<>();
    public static ArrayList<Integer> kar_sensors = new ArrayList<>();
    public ParseTaskAstana(){}


    @Override
    protected String doInBackground(Void... params) {
        // получаем данные с внешнего ресурса
        try {
            URL url = new URL("https://airkaz.org/astana.php");

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            resultJson = buffer.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("<script>var sensors_data =(.*)<\\/script>(.*)<div class=\"container-fluid\">");
        Matcher matcher = pattern.matcher(resultJson);
        if(matcher.find()){
            Log.d(LOG_TAG, "found");
        }
        resultJson = matcher.group(1);

        String cities = "{\"city\":";
        String s ="}";
        resultJson  = cities.concat(resultJson).concat(s);
        return resultJson;
    }

    @Override
    protected void onPostExecute(String strJson) {
        super.onPostExecute(strJson);

        try {
            JSONObject dataJsonObj = new JSONObject(strJson);
            sen1Ast = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(23).getString("pm25"));
            sen2ast = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(24).getString("pm25"));
            sen3ast = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(25).getString("pm25"));
            sen5ast = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(27).getString("pm25"));
            sen4ast = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(26).getString("pm25"));
            ast_sensors.add(sen1Ast);
            ast_sensors.add(sen2ast);
            ast_sensors.add(sen3ast);
            ast_sensors.add(sen4ast);
            ast_sensors.add(sen5ast);

            sen1alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(0).getString("pm25"));
            sen2alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(1).getString("pm25"));
            sen3alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(2).getString("pm25"));
            sen4alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(3).getString("pm25"));
            sen5alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(4).getString("pm25"));
            sen6alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(5).getString("pm25"));
            sen7alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(6).getString("pm25"));
            sen8alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(7).getString("pm25"));
            sen9alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(8).getString("pm25"));
            sen10alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(9).getString("pm25"));
            sen11alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(10).getString("pm25"));
            sen12alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(11).getString("pm25"));
            sen13alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(12).getString("pm25"));
            sen14alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(13).getString("pm25"));
            sen15alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(14).getString("pm25"));
            sen16alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(15).getString("pm25"));
            sen17alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(16).getString("pm25"));
            sen18alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(17).getString("pm25"));
            sen19alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(18).getString("pm25"));
            sen20alm = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(19).getString("pm25"));
            alm_sensors.add(sen1alm);
            alm_sensors.add(sen2alm);
            alm_sensors.add(sen3alm);
            alm_sensors.add(sen4alm);
            alm_sensors.add(sen5alm);
            alm_sensors.add(sen6alm);
            alm_sensors.add(sen7alm);
            alm_sensors.add(sen8alm);
            alm_sensors.add(sen9alm);
            alm_sensors.add(sen10alm);
            alm_sensors.add(sen11alm);
            alm_sensors.add(sen12alm);
            alm_sensors.add(sen13alm);
            alm_sensors.add(sen14alm);
            alm_sensors.add(sen15alm);
            alm_sensors.add(sen16alm);
            alm_sensors.add(sen17alm);
            alm_sensors.add(sen18alm);
            alm_sensors.add(sen19alm);
            alm_sensors.add(sen20alm);

            sen21kar = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(20).getString("pm25"));
            sen22kar = Integer.parseInt(dataJsonObj.getJSONArray("city").getJSONObject(21).getString("pm25"));
            kar_sensors.add(sen21kar);
            kar_sensors.add(sen22kar);

            all_sensors.addAll(ast_sensors);
            all_sensors.addAll(alm_sensors);
            all_sensors.addAll(kar_sensors);


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}