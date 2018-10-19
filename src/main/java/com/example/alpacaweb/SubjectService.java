package com.example.alpacaweb;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Optional<Subject> getSubjectById(long id){
        return subjectRepository.findById(id);
    }
}