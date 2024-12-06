package com.zutjmx.curso.java.astradb;

import com.datastax.astra.client.Collection;
import com.datastax.astra.client.DataAPIClient;
import com.datastax.astra.client.Database;
import com.datastax.astra.client.model.Document;
import com.datastax.astra.client.model.FindIterable;
import com.datastax.astra.client.model.SimilarityMetric;

public class AstraDbConfig {

    public void conecta() {
        // Initialize the client
        System.out.println("AstraDbConfig.conecta()");
        String astraDbAppToken = System.getenv("ASTRA_DB_APPLICATION_TOKEN");
        String astraDbApiEndPoint = System.getenv("ASTRA_DB_API_ENDPOINT");
        DataAPIClient client = new DataAPIClient(astraDbAppToken);
        Database db = client.getDatabase(astraDbApiEndPoint);
        System.out.println("Conectado a AstraDB " + db.listCollectionNames());
    }

    public void exploraDb() {
        System.out.println("AstraDbConfig.exploraDb()");
        // Loading Arguments
        String astraToken = System.getenv("ASTRA_DB_APPLICATION_TOKEN");
        String astraApiEndpoint = System.getenv("ASTRA_DB_API_ENDPOINT");

        // Initialize the client
        DataAPIClient client = new DataAPIClient(astraToken);
        System.out.println("Connected to AstraDB");

        Database db = client.getDatabase(astraApiEndpoint);
        System.out.println("Connected to Database.");

        // Create a collection. The default similarity metric is cosine.
        // Choose dimensions that match your vector data.
        // If you're not sure, use the vector dimension that your embeddings model
        // produces.
        Collection<Document> collection = db
                .createCollection("vector_test", 5, SimilarityMetric.COSINE);
        System.out.println("Created a collection");

        // Insert documents with embeddings into the collection
        collection.insertMany(
                new Document("1")
                        .append("text", "Chat bot integrated sneakers that talk to you")
                        .vector(new float[] { 0.1f, 0.15f, 0.3f, 0.12f, 0.05f }),
                new Document("2")
                        .append("text", "An AI quilt to help you sleep forever")
                        .vector(new float[] { 0.45f, 0.09f, 0.01f, 0.2f, 0.11f }),
                new Document("3")
                        .append("text", "A deep learning display that controls your mood")
                        .vector(new float[] { 0.1f, 0.05f, 0.08f, 0.3f, 0.6f }));
        System.out.println("Inserted documents into the collection");

        // Perform a similarity search
        FindIterable<Document> resultsSet = collection.find(
                new float[] { 0.15f, 0.1f, 0.1f, 0.35f, 0.55f },
                10);
        resultsSet.forEach(System.out::println);

    }

}
