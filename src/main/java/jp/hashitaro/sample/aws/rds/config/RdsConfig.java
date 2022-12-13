package jp.hashitaro.sample.aws.rds.config;


import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRdsInstance(
        dbInstanceIdentifier = "${rds.identifier",
        password = "${rds.password}",
        readReplicaSupport = false)
public class RdsConfig {
}
