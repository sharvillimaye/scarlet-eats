package co.blendlink.backend.repository;

import co.blendlink.backend.model.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {
    Optional<ApplicationUser> findApplicationUserByUsername(String username);
}
