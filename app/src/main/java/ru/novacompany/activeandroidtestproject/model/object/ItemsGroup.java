package ru.novacompany.activeandroidtestproject.model.object;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

@Table(name = "items_groups")
public class ItemsGroup extends Model {

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private Category category;

    public ItemsGroup(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public List<Item> items() {
        return getMany(Item.class, "item_group");
    }

}
