package com.github.mtgorganizer.mtgorganizerbackend.db.repo;

import com.github.mtgorganizer.mtgorganizerbackend.db.entity.PlayerCounterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerCounterRepo extends JpaRepository<PlayerCounterEntity, Long> {
}
