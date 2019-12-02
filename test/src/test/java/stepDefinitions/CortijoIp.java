package stepDefinitions;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CortijoIp {
    public static String getCortijoIp() throws Exception {
        HttpURLConnection connection = null;
        String cloudFunction = "https://5nwdav0wk9.execute-api.eu-central-1.amazonaws.com/dev/get_ip_clear";
        URL url = new URL(cloudFunction);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoInput(true);
        connection.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream ( connection.getOutputStream ());
        wr.flush ();
        wr.close ();
        InputStream is = connection.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        String line;
        StringBuffer response = new StringBuffer();
        while((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        return "http://" + response.toString() + ":8300/";
    }
}
