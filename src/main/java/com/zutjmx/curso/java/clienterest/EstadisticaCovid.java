package com.zutjmx.curso.java.clienterest;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class EstadisticaCovid {

    private final OkHttpClient client = new OkHttpClient();

    public void reporteTotal() throws IOException {
        System.out.println("EstadisticaCovid.reporteTotal()");
        String apiKey = System.getenv("X_API_KEY_COVID19");

        Request request = new Request.Builder()
                .url("https://covid-19-statistics.p.rapidapi.com/reports/total?date=2020-06-24")
                .addHeader("x-rapidapi-host", "covid-19-statistics.p.rapidapi.com")
                .addHeader("x-rapidapi-key", apiKey)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful())
                throw new IOException("Unexpected code " + response);

            Headers responseHeaders = response.headers();
            for (int i = 0; i < responseHeaders.size(); i++) {
                System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
            }

            System.out.println(response.body().string());
        }

    }
}
