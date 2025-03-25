package org.gycoding.service.infrastructure.external.database.repository;

import org.gycoding.service.infrastructure.external.database.model.FooEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooMongoRepository extends MongoRepository<FooEntity, String> { }
