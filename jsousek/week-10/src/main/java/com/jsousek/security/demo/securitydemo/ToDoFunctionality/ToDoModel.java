package com.jsousek.security.demo.securitydemo.ToDoFunctionality;

import com.jsousek.security.demo.securitydemo.auth.UserModel;
import lombok.*;
import javax.persistence.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "todo_table")
public class ToDoModel {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    UserModel user;

    @Setter(AccessLevel.NONE)
    @Id @GeneratedValue
    long id;

    String todoValue;
    boolean isUrgent;
    boolean isDone;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date timeStamp;

}
