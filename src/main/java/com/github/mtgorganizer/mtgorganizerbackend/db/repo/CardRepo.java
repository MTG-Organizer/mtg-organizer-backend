package com.github.mtgorganizer.mtgorganizerbackend.db.repo;

import com.github.mtgorganizer.mtgorganizerbackend.db.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepo extends JpaRepository<CardEntity, Long> {
    Optional<CardEntity> findByNameIgnoreCase(String name);

    @Query("SELECT c FROM CardEntity c JOIN c.decks d WHERE d.id = :deckId")
    List<CardEntity> findByDeckId(@Param("deckId") Long deckId);
}
