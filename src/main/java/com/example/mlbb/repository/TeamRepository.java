package com.example.mlbb.repository;

import com.example.mlbb.entity.Team;
import com.example.mlbb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByOwner(User owner);
}
