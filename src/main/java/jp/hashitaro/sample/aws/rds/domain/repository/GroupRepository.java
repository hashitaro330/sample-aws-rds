package jp.hashitaro.sample.aws.rds.domain.repository;

import jp.hashitaro.sample.aws.rds.domain.model.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
