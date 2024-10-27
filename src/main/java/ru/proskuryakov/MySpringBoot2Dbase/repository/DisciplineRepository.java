package ru.proskuryakov.MySpringBoot2Dbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.proskuryakov.MySpringBoot2Dbase.entity.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
