package com.dgs.graphql.datasource.problemz.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "solutionz")
public class Solutionz {

    @Id
    private UUID id;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;

    private String content;
    private String category;
    private int voteGoodCount;
    private int voteBadCount;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private Userz createdBy;

    @ManyToOne
    @JoinColumn(name = "problemz_id", nullable = false)
    private Problemz problemz;

    public Userz getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Userz createdBy) {
        this.createdBy = createdBy;
    }

    public Problemz getProblemz() {
        return problemz;
    }

    public void setProblemz(Problemz problemz) {
        this.problemz = problemz;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(LocalDateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getVoteGoodCount() {
        return voteGoodCount;
    }

    public void setVoteGoodCount(int voteGoodCount) {
        this.voteGoodCount = voteGoodCount;
    }

    public int getVoteBadCount() {
        return voteBadCount;
    }

    public void setVoteBadCount(int voteBadCount) {
        this.voteBadCount = voteBadCount;
    }

}
