package com.example.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Grade;
import com.example.service.GradeService;
import com.github.pagehelper.PageHelper;

@RestController
public class GradeController {

    @Resource
    private GradeService gradeService;
    
    @RequestMapping("/getByGradeNm")
    public List<Grade> getByGradeNm(String name){
        PageHelper.startPage(1, 10);
    	return gradeService.getByGradeNm(name);
    }
    
    public String test(HttpServletRequest request,HttpServletResponse response) {
    	
    	return "ok";
    }
    
}