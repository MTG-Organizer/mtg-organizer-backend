package com.github.mtgorganizer.mtgorganizerbackend.db.repo;

import com.github.mtgorganizer.mtgorganizerbackend.db.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepo extends JpaRepository<CardEntity, Long> {
    Optional<CardEntity> findByNameIgnoreCase(String name);

    @Query("SELECT c FROM CardEntity c JOIN c.decks d WHERE d.id = :deckId")
    List<CardEntity> findByDeckId(@Param("deckId") Long deckId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO cards_tokens (card_id, token_id) VALUES (:id, :permId)", nativeQuery = true)
    void addTokenBond(@Param("id") Long id, @Param("permId") Long permId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO cards_emblems (card_id, emblem_id) VALUES (:id, :permId)", nativeQuery = true)
    void addEmblemBond(@Param("id") Long id, @Param("permId") Long permId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO cards_permanent_counters (card_id, permanent_counter_id) VALUES (:id, :permId)", nativeQuery = true)
    void addPermanentCounterBond(@Param("id") Long id, @Param("permId") Long permId);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO cards_player_counters (card_id, player_counter_id) VALUES (:id, :permId)", nativeQuery = true)
    void addPlayerCounterBond(@Param("id") Long id, @Param("permId") Long permId);
}
