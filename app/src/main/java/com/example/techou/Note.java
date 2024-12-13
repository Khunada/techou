package com.example.techou;

import com.google.firebase.Timestamp;

public class Note {
    private String title;        // Judul catatan
    private String content;      // Isi catatan
    private String imageUrl;     // URL gambar (opsional)
    private Timestamp timestamp; // Waktu catatan dibuat atau diperbarui

    // Konstruktor tanpa argumen (diperlukan oleh Firebase Firestore)
    public Note() {
    }

    // Konstruktor untuk inisialisasi lengkap
    public Note(String title, String content, String imageUrl, Timestamp timestamp) {
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.timestamp = timestamp;
    }

    // Getter dan Setter untuk title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter dan Setter untuk content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Getter dan Setter untuk imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Getter dan Setter untuk timestamp
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    // Metode utilitas untuk mempermudah debug dan logging
    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
