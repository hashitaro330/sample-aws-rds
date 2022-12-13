package jp.hashitaro.sample.aws.rds.domain.repository;

import jp.hashitaro.sample.aws.rds.domain.model.entity.Membership;
import jp.hashitaro.sample.aws.rds.domain.model.entity.MembershipPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, MembershipPK> {
}
