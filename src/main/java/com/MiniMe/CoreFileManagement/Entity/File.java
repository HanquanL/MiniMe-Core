package com.MiniMe.CoreFileManagement.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private Long fileSize;
    private Date uploadDate;
    @Lob
    private byte[] fileDate;
}
