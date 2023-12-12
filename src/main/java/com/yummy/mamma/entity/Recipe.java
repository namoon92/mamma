package com.yummy.mamma.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long recipeId;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "food_id", nullable = false)
    private Food food;

    @Column(name = "amount")
    private String amount;

    // コンストラクタ、ゲッター、セッター、その他のメソッド

    // デフォルトコンストラクタはJPAの仕様に必要
    public Recipe() {
    }

    // コンストラクタは必要に応じて追加
    public Recipe(Menu menu, Food food, String amount) {
        this.menu = menu;
        this.food = food;
        this.amount = amount;
    }

    // ゲッターとセッターは必要に応じて追加
    // ...
}
