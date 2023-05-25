package com.app_helper.repository;

import com.app_helper.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NoteRepository extends JpaRepository<Note, Long> {
}
