package com.github.mtgorganizer.mtgorganizerbackend.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "media_metadata")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MediaMetadataEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url", unique = true, nullable = false)
    private String url;

    @OneToOne(mappedBy = "picture")
    private CardEntity card;

    @OneToOne(mappedBy = "picture")
    private TokenEntity token;

    @OneToOne(mappedBy = "picture")
    private PermanentCounterEntity permanentCounter;

    @OneToOne(mappedBy = "picture")
    private PlayerCounterEntity playerCounter;

    @OneToOne(mappedBy = "picture")
    private EmblemEntity emblem;
}
