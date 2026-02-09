package steps;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import javax.net.ssl.SSLContext;

public class ImportResultsToXray {
    String clientID = "F2498B97E48E432B8CA9C60B2643F5FE";
    String clientSecret = "00842304a949a62fb253162641daf2d466a7d12973a501542f69d7d63af17071";
    String Token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJiNmNhZGQwNS1lMzQxLTNmMTctYjU1Zi00OTM0MTI4MWQ4MmEiLCJhY2NvdW50SWQiOiI3MTIwMjA6OTM0MDYxMjItM2Y2Yi00YTQ4LWJiMTUtNTMyMzc3MzBmYmI4IiwiaXNYZWEiOmZhbHNlLCJpYXQiOjE3NzAyODI1MDYsImV4cCI6MTc3MDM2ODkwNiwiYXVkIjoiRjI0OThCOTdFNDhFNDMyQjhDQTlDNjBCMjY0M0Y1RkUiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiJGMjQ5OEI5N0U0OEU0MzJCOENBOUM2MEIyNjQzRjVGRSJ9.bgcQFw11IKBStxFpZpmpjlSEw7i9kJ5Pr8pFvbQG6nI";

    public String getToken() throws IOException, NoSuchAlgorithmException, KeyManagementException {
        // Méthode correcte pour HttpClient 4.x
        SSLContext sslContext = SSLContexts.custom()
                .useProtocol("TLSv1.2")  // useProtocol, PAS setProtocol
                .build();

        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
                sslContext,
                new String[]{"TLSv1.2", "TLSv1.3"},
                null,
                SSLConnectionSocketFactory.getDefaultHostnameVerifier()
        );

        try (CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(sslConnectionSocketFactory)
                .build()) {

            HttpPost request = new HttpPost("https://xray.cloud.getxray.app/api/v1/authenticate");
            request.addHeader("Content-Type", "application/json");

            String input = "{ \"client_id\": \"" + clientID + "\", \"client_secret\": \"" + clientSecret + "\"}";
            request.setEntity(new StringEntity(input, StandardCharsets.UTF_8));

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String result = EntityUtils.toString(response.getEntity());
                System.out.println(result);
                return result.replace("\"", "").trim();
            }
        }
    }

    // public static void MAJJSON() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, InterruptedException {
    public static void MAJJSON() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, InterruptedException {
        String Token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJiNmNhZGQwNS1lMzQxLTNmMTctYjU1Zi00OTM0MTI4MWQ4MmEiLCJhY2NvdW50SWQiOiI3MTIwMjA6OTM0MDYxMjItM2Y2Yi00YTQ4LWJiMTUtNTMyMzc3MzBmYmI4IiwiaXNYZWEiOmZhbHNlLCJpYXQiOjE3NzAyODI1MDYsImV4cCI6MTc3MDM2ODkwNiwiYXVkIjoiRjI0OThCOTdFNDhFNDMyQjhDQTlDNjBCMjY0M0Y1RkUiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiJGMjQ5OEI5N0U0OEU0MzJCOENBOUM2MEIyNjQzRjVGRSJ9.bgcQFw11IKBStxFpZpmpjlSEw7i9kJ5Pr8pFvbQG6nI";

        HttpURLConnection conn;
        URL url;
        String result;
        String URL = "https://xray.cloud.getxray.app/api/v1/import/execution/cucumber";
        //Call the openConnection method on the URL to create a connection object
        url = new URL(URL);
        conn = (HttpURLConnection) url.openConnection();

        //Various settings of HttpURLConnection
        //Set HTTP method to POST
        conn.setRequestMethod("POST");
        //Allow body submission of request
        conn.setDoInput(true);
        //Allow body reception of response
        conn.setDoOutput(true);
        //Specify Json format
        conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        conn.setRequestProperty("Authorization", "Bearer " + Token);
        // 2.Establish a connection
        conn.connect();
        // 3.Write to request and body
        //Get OutputStream from HttpURLConnection and write json string
        Thread.sleep(10000);
        PrintStream ps = new PrintStream(conn.getOutputStream());

        Path filePath = Path.of(System.getProperty("user.dir") + "\\target\\cucumber.json");
        String content = Files.readString(filePath);
        System.out.println("mon fichier  = " + content);
        ps.print(content);
        ps.close();

        // 4.Receive a response
        //HttpStatusCode 200 is returned at the end of normal operation
        if (conn.getResponseCode() != 200) {
            //Error handling
        }
        //Get InputStream from HttpURLConnection and read
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        result = sb.toString();
        // 5.Disconnect
        conn.disconnect();
        //Return the result to the caller
        System.out.println(result);

    }
}
/*
    @Test
    public void testimport() throws IOException, NoSuchAlgorithmException, KeyManagementException, KeyStoreException, InterruptedException {
        getToken();
      //  MAJJSON();
    }
}

 */