import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WorWithJSON {
    public static String read(String URLaddres) {
        try {
            URL url = new URL(URLaddres);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line = "";
                for (; (line = bufferedReader.readLine()) != null; ) {
                    return line;
                }


            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static Curency []  fromJSON(String json) {
        Gson gson = new GsonBuilder().create();
        Curency[] curencies = gson.fromJson(json, Curency[].class);
        for (Curency curency : curencies) {
            System.out.println("CCY = " + curency.getCcy() + "BASE_CCY" + curency.getBase_ccy() + "BUY" + curency.getBuy() + " SALE= " +
                    curency.getSale());
        }
        return curencies;
    }

    public static void ToJSON(Curency [] curencies){
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(curencies));

    }


}
