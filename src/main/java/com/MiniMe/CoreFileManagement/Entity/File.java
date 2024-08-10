package com.MiniMe.CoreFileManagement.Entity;

import jakarta.persistence.*;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private Long fileSize;
    @Lob
    private byte[] fileDate;
}
