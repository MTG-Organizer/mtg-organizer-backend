package com.github.mtgorganizer.mtgorganizerbackend.db.repo;

import com.github.mtgorganizer.mtgorganizerbackend.db.entity.DeckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepo extends JpaRepository<DeckEntity, Long> {
    @Query("SELECT MAX(d.id) FROM DeckEntity d")
    Long findMaxId();
}
