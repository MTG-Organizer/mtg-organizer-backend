package com.github.mtgorganizer.mtgorganizerbackend.db.repo;

import com.github.mtgorganizer.mtgorganizerbackend.db.entity.DeckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DeckRepo extends JpaRepository<DeckEntity, Long> {
    @Query("SELECT MAX(d.id) FROM DeckEntity d")
    Long findMaxId();

    @Transactional
    @Modifying
    @Query(value = """
            DELETE
            FROM cards_decks
            WHERE cards_decks.card_id = :cardId
              AND cards_decks.deck_id = :deckId
            """, nativeQuery = true)
    void deleteCardFromDeck(@Param("cardId") Long cardId, @Param("deckId") Long deckId);

    @Transactional
    @Modifying
    @Query(value = """
            INSERT
            INTO cards_decks(card_id, deck_id, number_of_cards)
            VALUES (:cardId, :deckId, 1)
            """, nativeQuery = true)
    void addCardToDeck(@Param("cardId") Long cardId, @Param("deckId") Long deckId);
}
