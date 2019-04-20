package com.example.model;
import java.util.Date;


/**
 * Created by Tec on 25-Feb-19.
 */

public interface ITaskModel {
    Task update(int index, Task task);
    void add (String name, String desc, Date date);
    void delete(int index);

}
