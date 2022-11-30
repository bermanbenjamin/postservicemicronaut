package com.postservicemicronaut.repository;

import com.postservicemicronaut.model.Post;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface PostRepository extends CrudRepository<Post, Long> {
}

