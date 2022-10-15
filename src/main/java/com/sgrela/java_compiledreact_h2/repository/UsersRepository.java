package com.sgrela.java_compiledreact_h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.sgrela.java_compiledreact_h2.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {}
