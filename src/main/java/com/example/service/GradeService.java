package com.example.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Grade;
import com.example.mapper.GradeMapper;

@Service
@MapperScan("com.example.mapper")
public class GradeService {
    
    @Autowired
    private GradeMapper gradeMapper;
    
    public List<Grade> getByGradeNm(String name){
        return gradeMapper.getByGradeNm(name);
    }
    
}
