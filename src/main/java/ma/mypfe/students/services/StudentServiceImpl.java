package ma.mypfe.students.services;

import ma.mypfe.students.dtos.StudentDTO;
import ma.mypfe.students.entities.StudentEntity;
import ma.mypfe.students.mappers.StudentMapper;
import ma.mypfe.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






import java.util.List;

@Service
@Profile({"local","prod"})
public class StudentServiceImpl implements StudentService{
    private final Logger LOG = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public StudentDTO create(StudentDTO dto) {
        LOG.debug("start method create {} ",dto);
        StudentEntity studentEntity = repository.create(mapper.ConvertDtoToEntity(dto));
        LOG.debug("end method create");
        return mapper.ConvertEntityToDto(studentEntity);
    }

    @Override
    public boolean update(StudentDTO dto) {
        LOG.debug("start method update");
        boolean bool = repository.update(mapper.ConvertDtoToEntity(dto));
        LOG.debug("end method create");
        return bool;
    }

    @Override
    public boolean delete(long id) {

        LOG.debug("start method delete id {} ", id );
        boolean bool = repository.delete(id);
        LOG.debug("end method delete");
        return bool;
    }

    @Override
    public List<StudentDTO> readAll() {
        LOG.debug("start method read all");
        List<StudentDTO> studentDtoList = mapper.ConvertEntitiesToDtos(repository.readAll());
        LOG.debug("end method read all");
        return studentDtoList;
    }
}
