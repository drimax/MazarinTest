package com.mazarin.mazarinTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by hp on 1/23/2017.
 */

@Entity
@Table(name = "t_audit" , catalog = "mazarintest")
public class Audit {

    private int id;

    private String message;

    private Date date;

    @Id
    @Column(name = "audit_id" , unique = true, nullable = false,length = 100)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "message" , unique = true, nullable = false,length = 255)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Column(name = "audit_date" , unique = true, nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
