package com.app_helper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@Entity
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Date createDate;
    private NoteStatus status;

    public Note(String title, Date createDate, NoteStatus status) {
        this.title = title;
        this.createDate = createDate;
        this.status = status;
    }
}
