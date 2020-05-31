package com.li.drip.controller;

import com.li.drip.entity.Note;
import com.li.drip.service.PublicNoteService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 13:17
 */
@Controller
@RequestMapping("/personaldata")
public class PublicNoteController {
  @Autowired
    private PublicNoteService publicNoteService;
  @RequestMapping("saveNote")
  @ResponseBody
    public Boolean saveNote(@RequestBody Note note,HttpServletRequest request){
     return publicNoteService.saveNote(note,request);
  }
  @RequestMapping("deleteNote")
  @ResponseBody
  public Boolean deleteNote(@RequestBody Note note){
    return publicNoteService.deleteNote(note);
  }
  @RequestMapping("searchNote")
  @ResponseBody
  public List<Note> searchNote(@RequestBody Note note){
    return publicNoteService.searchNote(note);
  }

}
