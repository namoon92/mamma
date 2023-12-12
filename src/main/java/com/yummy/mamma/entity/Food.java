package com.yummy.mamma.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    private Long foodId;

    @Column(name = "food_name", nullable = false)
    private String foodName;

    @Column(name = "food_category_id", nullable = false)
    private Long foodCategoryId;

    @Column(name = "register_user_id", nullable = false)
    private Long registerUserId;

    // コンストラクタ、ゲッター、セッター、その他のメソッド

    // デフォルトコンストラクタはJPAの仕様に必要
    public Food() {
    }

    // コンストラクタは必要に応じて追加
    public Food(String foodName, Long foodCategoryId, Long registerUserId) {
        this.foodName = foodName;
        this.foodCategoryId = foodCategoryId;
        this.registerUserId = registerUserId;
    }

    // ゲッターとセッターは必要に応じて追加
    // ...

}
