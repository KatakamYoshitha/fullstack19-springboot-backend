package com.fullstack19.backend.controller;

import com.fullstack19.backend.model.Program;
import com.fullstack19.backend.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/programs")
@CrossOrigin(origins = "*")
public class ProgramController {

    @Autowired
    private ProgramRepository programRepository;

    @GetMapping
    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }

    @PostMapping
    public Program addProgram(@RequestBody Program program) {
        return programRepository.save(program);
    }
}
