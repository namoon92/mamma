package com.yummy.mamma.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "language", nullable = false, columnDefinition = "int default 1")
    private int language;

    @Column(name = "register_date", nullable = false)
    private Date registerDate;

    @Column(name = "edit_date")
    private Date editDate;

    @Column(name = "delete_flag", nullable = false, columnDefinition = "tinyint default 0")
    private int deleteFlag;

    // コンストラクタ、ゲッター、セッター、その他のメソッド

    // デフォルトコンストラクタはJPAの仕様に必要
    public User() {
    }

    // コンストラクタは必要に応じて追加
    public User(String firstName, String lastName, int language, Date registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
        this.registerDate = registerDate;
    }

    // ゲッターとセッターは必要に応じて追加
    // ...
}
