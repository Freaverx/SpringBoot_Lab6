package ru.proskuryakov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.proskuryakov.MySpringBoot2Dbase.entity.Discipline;
import ru.proskuryakov.MySpringBoot2Dbase.repository.DisciplineRepository;

import java.util.List;

@Service
public class DisciplineService {

    private final DisciplineRepository disciplineRepository;

    public DisciplineService(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    public List<Discipline> getAllDisciplines() {
        return disciplineRepository.findAll();
    }

    public Discipline getDiscipline(int id) {
        return disciplineRepository.findById(id).orElse(null);
    }

    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    public void deleteDiscipline(int id) {
        disciplineRepository.deleteById(id);
    }
}
