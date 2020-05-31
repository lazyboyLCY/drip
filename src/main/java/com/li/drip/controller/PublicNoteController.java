package com.li.drip.controller;

import com.li.drip.entity.Article;
import com.li.drip.entity.Note;
import com.li.drip.service.PublicNoteService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LiKaiXin
 * @date 2020-05-31 13:17
 */
@Controller
@RequestMapping("/publicnote")
public class PublicNoteController {
  @Autowired
    private PublicNoteService publicNoteService;

  @RequestMapping("/testpublicnote")
  public ModelAndView publicarticle(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView("takenotes");
    String username= (String) request.getSession().getAttribute("username");
    mv.addObject("username",username);
    return mv;
  }
  @RequestMapping("/mynote")
  public ModelAndView mynote(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView("mynote");
    String username= (String) request.getSession().getAttribute("username");
    mv.addObject("username",username);
    return mv;
  }
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
  public ModelAndView searchNote(Note note,HttpServletRequest request){//查询笔记
    ModelAndView mv=new ModelAndView("mynote");
    String username= (String) request.getSession().getAttribute("username");
    note.setUsername(username);
    List<Note> list=publicNoteService.searchNote(note);
    mv.addObject("list", list);
    mv.addObject("username",username);
    return mv;
  }
}
