package application;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor

    @Entity
    @Table(name = "todos")

    public class ToDo {
        @Setter(AccessLevel.NONE)
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;

        @Temporal(TemporalType.TIMESTAMP)
        private java.util.Date utilTimestamp;

        String title;
        boolean urgent;
        boolean done;

        @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        User user;


    }

