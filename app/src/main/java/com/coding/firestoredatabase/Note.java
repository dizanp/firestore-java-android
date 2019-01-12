package com.coding.firestoredatabase;

import com.google.firebase.firestore.Exclude;

import java.security.PrivateKey;

/**
 * Created by Mr Dizan on 12/24/2018.
 */

public class Note {
    private String title,description,documentId;
    private int priority;

    public Note(String title, String description, int priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public Note(){

    }

    @Exclude
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
