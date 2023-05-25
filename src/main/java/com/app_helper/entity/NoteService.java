package com.app_helper.entity;

import com.app_helper.repository.NoteRepository;
import lombok.Data;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Data
@Service
public class NoteService {
    private NoteRepository noteRepository;

    public List<Note> getNoteList() {
        return noteRepository.findAll(Sort.by("id"));
    }

    public Note getNoteById(Long id) {
        List<Note> noteList = noteRepository.findAll();
        for (Note note : noteList) {
            if (Objects.equals(note.getId(), id)) {
                return note;
            }
        }
        return null;
    }

    public void createNote(Note note) {
        noteRepository.save(note);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }

    public void editNote(Note note) {
        noteRepository.save(note);
    }

    public void editNoteById(Note note) {
        noteRepository.save(getNoteById(note.getId()));
    }

}
