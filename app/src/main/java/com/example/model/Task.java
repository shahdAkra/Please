

/**
 * Created by Tec on 25-Feb-19.
 */
package com.example.model;

import java.util.Date;
import java.util.List;

public class Task  {
    private String name;
    private String description;
    private Date date;
    public Task(){}

    public Task(String name, String description, Date date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
