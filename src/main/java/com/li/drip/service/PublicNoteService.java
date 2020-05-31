package com.li.drip.service;

import com.li.drip.entity.Article;
import com.li.drip.entity.Note;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PublicNoteService {
    Boolean saveNote(Note note,HttpServletRequest request);
    Boolean deleteNote(Note note);
    List<Note> searchNote(Note note);
}
