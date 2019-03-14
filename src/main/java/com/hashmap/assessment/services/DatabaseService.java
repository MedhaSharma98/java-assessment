package com.hashmap.assessment.services;

import com.hashmap.assessment.model.Database;
import lombok.Getter;

@Getter
public class DatabaseService {
    private static DatabaseService ourInstance;
    private  Database database;

    public static DatabaseService getInstance() {
        if(ourInstance==null){
            ourInstance =new DatabaseService();
        }
        return ourInstance;
    }

    private DatabaseService() {
        database = new Database();
    }

}
