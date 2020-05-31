package com.li.drip.dao;

import com.li.drip.entity.Article;
import com.li.drip.entity.Note;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDao {
    Boolean saveNote(Note note);
    Boolean deleteNote(Integer id);
    List<Note> searchNote(Note note);
}
