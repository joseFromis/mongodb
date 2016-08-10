package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.net.UnknownHostException;

/**
 * Created by jose on 26/7/16.
 */
public class HelloWorldMongoDBStyle {

    public static void main(String[] args) throws UnknownHostException{
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));

        DB database = client.getDB("course");
        DBCollection collection = database.getCollection("hello");

        DBObject document = collection.findOne();
        System.out.println(document);

    }
}


