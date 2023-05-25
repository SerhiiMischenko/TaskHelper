package com.app_helper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@Entity
public class Note {
    @Id
    private Long id;
    private String title;
    private Date createDate;
    private NoteStatus status;
}
