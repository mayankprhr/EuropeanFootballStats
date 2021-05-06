package io.hauxi.epldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.hauxi.epldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
