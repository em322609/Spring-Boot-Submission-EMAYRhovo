package com.example.RhovoSubmission.repository;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.RhovoSubmission.models.Role;
import com.example.RhovoSubmission.models.ERole;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}