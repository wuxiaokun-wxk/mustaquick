package com.mustaquick;

import java.sql.ResultSet;

public interface Query {
    public abstract ResultSet queryByName(String name);
    public abstract String queryByAddress();


}
