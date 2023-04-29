package example.micronaut;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        HttpGet get = new HttpGet("http://localhost:8080/products");
        CloseableHttpClient httpClient = HttpClients.createDefault();

        CloseableHttpResponse response = httpClient.execute(get);

        System.out.println(response.getStatusLine());

        httpClient.close();
    }
}