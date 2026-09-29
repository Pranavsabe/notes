package com.example.notes;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteRepository repo;

    public NoteController(NoteRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Note> all() { return repo.findAll(); }

    @PostMapping
    public Note add(@RequestBody Note note) { return repo.save(note); }
}