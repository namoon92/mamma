package com.yummy.mamma.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int menuId;

    @Column(name = "menu_name", nullable = false)
    private String menuName;

    @Column(name = "menu_category_id", nullable = false)
    private int menuCategoryId;

    @Column(name = "timing_id", nullable = false)
    private int timingId;

    @Column(name = "favorite_level", nullable = false)
    private int favoriteLevel;

    @Column(name = "register_date", nullable = false)
    private Date registerDate;

    @Column(name = "edit_date")
    private Date editDate;

    @Column(name = "delete_flag", nullable = false, columnDefinition = "tinyint default 0")
    private boolean deleteFlag;

    @Column(name = "register_user_id", nullable = false)
    private int registerUserId;

    // コンストラクタ、ゲッター、セッター、その他のメソッド

    // デフォルトコンストラクタはJPAの仕様に必要
    public Menu() {
    }

    // コンストラクタは必要に応じて追加
    public Menu(String menuName, int menuCategoryId, int timingId, int favoriteLevel,
                Date registerDate, int registerUserId) {
        this.menuName = menuName;
        this.menuCategoryId = menuCategoryId;
        this.timingId = timingId;
        this.favoriteLevel = favoriteLevel;
        this.registerDate = registerDate;
        this.registerUserId = registerUserId;
    }

    // ゲッターとセッターは必要に応じて追加

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuCategoryId(int menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }

    public int getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setTimingId(int timingId) {
        this.timingId = timingId;
    }

    public int getTimingId() {
        return timingId;
    }

    public void setFavoriteLevel(int favoriteLevel) {
        this.favoriteLevel = favoriteLevel;
    }

    public int getFavoriteLevel() {
        return favoriteLevel;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

     public Date getEditDate() {
        return editDate;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }


    public boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param registerUserId
     */
    public void setregisterUserId(int registerUserId) {
        this.registerUserId = registerUserId;
    }

     public int getregisterUserId() {
        return registerUserId;
    }

    /**
     * @param registerDate
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    @PrePersist
    protected void onCreate() {
        // エンティティが保存される前に自動的に呼び出される
        if (registerDate == null) {
            registerDate = new Date();
        }
    }
}
