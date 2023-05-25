package com.app_helper.entity;

import com.app_helper.repository.NoteRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class NoteService {
    private NoteRepository noteRepository;


}
