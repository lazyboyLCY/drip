package com.li.drip.service.impl;

import com.li.drip.controller.PublicNoteController;
import com.li.drip.dao.NoteDao;
import com.li.drip.entity.Note;
import com.li.drip.service.PublicNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 13:18
 */
@Service
public class PublicNoteServiceImpl implements PublicNoteService {
    @Autowired
    private NoteDao noteDao;
    @Override
    public Boolean saveNote(Note note) {
        return noteDao.saveNote(note);
    }

    @Override
    public Boolean deleteNote(Note note) {
        return noteDao.deleteNote(note.getId());
    }

    @Override
    public List<Note> searchNote(Note note) {
        return noteDao.searchNote(note);
    }
}
