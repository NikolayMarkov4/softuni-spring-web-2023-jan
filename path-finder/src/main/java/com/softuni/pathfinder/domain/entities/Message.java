package com.softuni.pathfinder.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Message extends BaseEntity {

    @Column(name = "date_time")
    private String dateTime;

    @Column(name = "text_content")
    private String textContent;

    @ManyToOne
    private User author;

    @ManyToOne
    private User recipient;

    public Message() {
    }

    public String getDateTime() {
        return dateTime;
    }

    public Message setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public Message setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Message setAuthor(User author) {
        this.author = author;
        return this;
    }

    public User getRecipient() {
        return recipient;
    }

    public Message setRecipient(User recipient) {
        this.recipient = recipient;
        return this;
    }
}
