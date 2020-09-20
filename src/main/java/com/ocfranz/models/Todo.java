package com.ocfranz.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "todo")
public class Todo {
    @Id
    private String id = UUID.randomUUID().toString().substring(0,10);
    private String title;
    private boolean isCompleted;
    private Integer estimated;
    private Date date;
    private Date createdAt = new Date();

    public Todo(){

    }

    public Todo(String title, boolean isCompleted, Integer estimated, Date date) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
        this.estimated = estimated;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Integer getEstimated() {
        return estimated;
    }

    public void setEstimated(Integer estimated) {
        this.estimated = estimated;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
