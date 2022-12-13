package jp.hashitaro.sample.aws.rds.domain.repository;

import jp.hashitaro.sample.aws.rds.domain.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
