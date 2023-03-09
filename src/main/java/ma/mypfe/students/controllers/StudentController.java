package ma.mypfe.students.controllers;

import ma.mypfe.students.dtos.StudentDTO;
import ma.mypfe.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {
    @Autowired

    private StudentService service;
    private final Logger LOG = LoggerFactory.getLogger(StudentController.class);


    public StudentController(StudentService service) {
       this.service = service;
    }



    @PostMapping("/save")

    public StudentDTO save(@RequestBody StudentDTO dto) {

        LOG.debug("start method save");
        StudentDTO studentDto = service.create(dto);
        LOG.debug("end method save");
        return studentDto;
    }

@PutMapping
    public boolean update(StudentDTO dto) {
    LOG.debug("start method update");
    boolean bool = service.update(dto);
    LOG.debug("end method update");
    return bool;

    }

@DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {

    LOG.debug("start method delete");
    boolean bool = service.delete(id);
    LOG.debug("end method delete");
    return bool;    }

@GetMapping
    public List<StudentDTO> readAll() {

    LOG.debug("start method read All");
    List<StudentDTO> studentDtoList = service.readAll();
    LOG.debug("end method read All");
    return studentDtoList;    }
}
