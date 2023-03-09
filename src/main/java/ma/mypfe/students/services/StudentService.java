package ma.mypfe.students.services;

import ma.mypfe.students.dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO create(StudentDTO dto);
    boolean update(StudentDTO dto);
    boolean delete(long id);
    List<StudentDTO> readAll();
}
