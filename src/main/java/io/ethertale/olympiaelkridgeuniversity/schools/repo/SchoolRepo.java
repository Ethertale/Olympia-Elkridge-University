package io.ethertale.olympiaelkridgeuniversity.schools.repo;

import io.ethertale.olympiaelkridgeuniversity.schools.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {
}
