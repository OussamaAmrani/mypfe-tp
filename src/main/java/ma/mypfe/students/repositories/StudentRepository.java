package ma.mypfe.students.repositories;

import ma.mypfe.students.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    StudentEntity create(StudentEntity entity);
    boolean update(StudentEntity entity);
    boolean delete(long id);
    List<StudentEntity> readAll();

}
