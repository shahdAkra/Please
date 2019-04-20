package com.example.model;
public class ModelFactory {

    public ITaskModel getModel(){
        return new TaskModelMock();
    }
}
