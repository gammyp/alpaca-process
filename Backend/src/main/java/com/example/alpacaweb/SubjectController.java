
package com.example.alpacaweb;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")

public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/subject/{subjectId}" ,method = RequestMethod.GET)
    public ResponseEntity<Optional<Subject>> getSubjectById(@PathVariable (value = "subjectId") Long subjectId){
        Optional<Subject> firstSubject = subjectService.getSubjectById(subjectId);
        return new ResponseEntity<Optional<Subject>>(firstSubject,HttpStatus.OK);
    }
}
