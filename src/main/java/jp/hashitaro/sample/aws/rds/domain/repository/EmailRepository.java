package jp.hashitaro.sample.aws.rds.domain.repository;

import jp.hashitaro.sample.aws.rds.domain.model.entity.Email;
import jp.hashitaro.sample.aws.rds.domain.model.entity.EmailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, EmailPK> {
}
