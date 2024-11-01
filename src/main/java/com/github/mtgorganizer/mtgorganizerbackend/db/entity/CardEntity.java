package com.github.mtgorganizer.mtgorganizerbackend.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "picture_id", referencedColumnName = "id")
    private MediaMetadataEntity picture;

    @ManyToMany
    @JoinTable(
            name = "cards_tokens",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "token_id")
    )
    private Set<TokenEntity> tokens;

    @ManyToMany
    @JoinTable(
            name = "cards_permanent_counters",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "permanent_counter_id")
    )
    private Set<PermanentCounterEntity> permanentCounters;

    @ManyToMany
    @JoinTable(
            name = "cards_player_counters",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "player_counter_id")
    )
    private Set<PlayerCounterEntity> playerCounters;

    @ManyToMany
    @JoinTable(
            name = "cards_emblems",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "emblem_id")
    )
    private Set<EmblemEntity> emblems;

    @OneToMany(mappedBy = "card")
    private Set<CardDeckEntity> decks;

    @ManyToMany(mappedBy = "cards")
    private Set<PlayerEntity> players;
}
