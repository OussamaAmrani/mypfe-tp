package ma.mypfe.students.repositories;

import ma.mypfe.students.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository

public class StudentRepositoryImp implements StudentRepository{
    private final Logger LOG = LoggerFactory.getLogger(ma.mypfe.students.repositories.StudentRepositoryImp.class);


    @Override
    public StudentEntity create(StudentEntity entity) {
        LOG.debug("start method create");
        return new StudentEntity();    }

    @Override
    public boolean update(StudentEntity entity) {
        LOG.debug("start method update");
        return false;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start method delete");
        return false;    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start method read all");
        return new ArrayList<>();
    }
}
