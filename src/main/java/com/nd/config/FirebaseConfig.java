package com.nd.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Configuration
public class FirebaseConfig {
    private final String serviceAccountKeyPath = "C:\\Users\\DUC NGUYEN\\Desktop\\FILE\\MVC\\ProjectCommerce\\src\\main\\webapp\\resources\\commerce_firebase.json";

    @Bean
    public Storage storage() throws IOException {
        InputStream serviceAccount = Files.newInputStream(Paths.get(serviceAccountKeyPath));
        return StorageOptions.newBuilder().setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build().getService();
    }
}
