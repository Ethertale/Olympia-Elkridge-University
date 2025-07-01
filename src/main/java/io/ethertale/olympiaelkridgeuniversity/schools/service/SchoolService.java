package io.ethertale.olympiaelkridgeuniversity.schools.service;

import io.ethertale.olympiaelkridgeuniversity.schools.model.MainStudy;
import io.ethertale.olympiaelkridgeuniversity.schools.model.School;
import io.ethertale.olympiaelkridgeuniversity.schools.repo.SchoolRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;

    public SchoolService(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    public List<School> getAllSchools() {
        return schoolRepo.findAll();
    }

    public List<School> getAllLawBranches(){
        return schoolRepo.findAll()
                .stream()
                .filter(school -> school.getSchool() == MainStudy.LAW)
                .collect(Collectors.toList());
    }
    public List<School> getAllComputerScienceBranches(){
        return schoolRepo.findAll()
                .stream()
                .filter(school -> school.getSchool() == MainStudy.COMPUTER_SCIENCE)
                .collect(Collectors.toList());
    }
    public List<School> getAllMedicineBranches(){
        return schoolRepo.findAll()
                .stream()
                .filter(school -> school.getSchool() == MainStudy.MEDICINE)
                .collect(Collectors.toList());
    }
    public List<School> getAllEngineeringBranches(){
        return schoolRepo.findAll()
                .stream()
                .filter(school -> school.getSchool() == MainStudy.ENGINEERING)
                .collect(Collectors.toList());
    }
    public List<School> getAllQuantumPhysicsBranches(){
        return schoolRepo.findAll()
                .stream()
                .filter(school -> school.getSchool() == MainStudy.QUANTUM_PHYSICS)
                .collect(Collectors.toList());
    }
}
