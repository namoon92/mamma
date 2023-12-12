package com.yummy.mamma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yummy.mamma.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    // 追加のカスタムクエリメソッドがあればここに追加できます
    // 例: List<Menu> findByMenuName(String menuName);

}

