package com.Tudod.Tudod;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    private Long id;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
