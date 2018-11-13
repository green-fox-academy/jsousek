package application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor

    @Entity
    public class ToDo {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;
        String title;
        boolean urgent;
        boolean done;
    }

