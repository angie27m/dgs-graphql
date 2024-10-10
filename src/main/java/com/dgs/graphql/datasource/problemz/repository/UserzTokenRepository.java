package com.dgs.graphql.datasource.problemz.repository;

import com.dgs.graphql.datasource.problemz.entity.UserzToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserzTokenRepository extends CrudRepository<UserzToken, UUID> {
}
