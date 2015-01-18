package ru.novacompany.activeandroidtestproject.model.object;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "items")
public class Item extends Model {

    @Column(name = "name")
    private String name;

    @Column(name = "item_group")
    private ItemsGroup itemsGroup;

    public Item(String name, ItemsGroup itemsGroup){
        this.name = name;
        this.itemsGroup = itemsGroup;
    }
}
