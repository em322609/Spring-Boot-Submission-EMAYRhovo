package com.example.RhovoSubmission.controllers;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
/*
    The following Controller contains a HTTP request mapping for pulling collection data from Opensea.
    params : collection_name
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class DataController {
    @GetMapping("/get-data-opensea")
            public String getOpenseasData(@RequestParam(name = "collection_name") String collectionName) throws IOException {
                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url("https://api.opensea.io/api/v1/collection/"+collectionName)
                        .get()
                        .build();

                Response response = client.newCall(request).execute();
                return response.peekBody(99999L).string();
                }
}
