package com.mustaquick;

import java.sql.ResultSet;

public interface Query {
    public abstract void queryByName(String name);
    public abstract String queryByAddress();


}
