package com.mockito;

public class ClassTest {
    public final Database database;


    public ClassTest(Database database) {
        this.database = database;
    }
    public boolean query(String string){
        return this.database.query(string);
    }
}
