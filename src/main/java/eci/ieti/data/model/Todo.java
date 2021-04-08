package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Todo {

    public Todo() {
    }

    @Id
    private String id;

    private String  description, responsible, status;
    private Date dueDate;
    private Integer priority;

    public Todo(String description, String responsible, String status, Date dueDate, Integer priority) {
        this.description = description;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s,description=%s, priority='%s', dueDate='%s', responsible='%s', status='%s']",
                id,description,priority,dueDate,responsible,status);
    }
}
