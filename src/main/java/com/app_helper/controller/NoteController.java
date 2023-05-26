package com.app_helper.controller;

import com.app_helper.entity.Note;
import com.app_helper.entity.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/list")
    public String getAllNotes(Model model) {
        try {
            model.addAttribute("list",noteService.getNoteList());
        }catch (NullPointerException ignored) {
        }
        return "list";
    }
    @GetMapping("/create")
    public String createNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "create";
    }

    @PostMapping("/create")
    public String createNoteSubmit(@ModelAttribute("note") Note note) {
            noteService.createNote(note);
        return "redirect:/note/list";
    }
}
