package com.yummy.mamma.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "menu_history")
public class MenuHistory {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "served_date")
    private Date servedDate;

    @Column(name = "timing_id", nullable = false)
    private Long timingId;

    @Column(name = "menu_id_list", nullable = false)
    private String menuIdList;

    @Column(name = "register_date", nullable = false)
    private Date registerDate;

    // コンストラクタ、ゲッター、セッター、その他のメソッド

    // デフォルトコンストラクタはJPAの仕様に必要
    public MenuHistory() {
    }

    // コンストラクタは必要に応じて追加
    public MenuHistory(Long userId, Date servedDate, Long timingId, List<Long> menuIdList, Date registerDate) {
        this.userId = userId;
        this.servedDate = servedDate;
        this.timingId = timingId;
        this.menuIdList = convertMenuIdListToString(menuIdList);
        this.registerDate = registerDate;
    }

    // ゲッターとセッターは必要に応じて追加
    // ...

    // リストをCSV形式の文字列に変換するメソッド
    private String convertMenuIdListToString(List<Long> menuIdList) {
        return String.join(",", menuIdList.stream().map(String::valueOf).toArray(String[]::new));
    }

    // CSV形式の文字列をリストに変換するメソッド
    //private List<Long> convertStringToMenuIdList(String menuIdList) {
    //    return List.of(menuIdList.split(",")).stream().map(Long::valueOf).toList();
    //}
}