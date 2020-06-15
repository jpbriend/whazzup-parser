package fr.jpbriend.whazzup.model;

import java.io.Serializable;

public class IvaoServer implements Serializable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
