package org.example.webservices;

public class MongoDBSecret {
    private final String uri;

    public MongoDBSecret(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}
