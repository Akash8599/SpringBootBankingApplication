package Repo;

import Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
