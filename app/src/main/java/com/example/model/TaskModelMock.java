package com.example.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by Tec on 25-Feb-19.
 */

public class TaskModelMock implements ITaskModel {
    private List<Task> tasks;
    Date  date = new Date();

    public TaskModelMock(){
        tasks = new ArrayList<>();
        tasks.add(new Task("Ptoject", "android", date));
        tasks.add(new Task("Assignment", "Software Engineer", date));



    }

    public void add(String name, String desc , Date date){
        tasks.add(new Task (name,desc,date));


    }


    public Task update(int index, Task task ){
        tasks.set(index, task);

        return task;

    }


    public void delete(int index){
        tasks.remove(index);
    }


}
