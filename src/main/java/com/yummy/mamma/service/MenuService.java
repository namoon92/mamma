package com.yummy.mamma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yummy.mamma.entity.Menu;
import com.yummy.mamma.repository.MenuRepository;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // 例: 全てのメニューを取得するメソッド
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    /**
     * @param menu
     */
    public void saveMenu(Menu menu) {
        menuRepository.save(menu);
    }

    // 他のメソッドも同様に追加できます
}

