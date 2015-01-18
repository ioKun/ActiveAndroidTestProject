package ru.novacompany.activeandroidtestproject.model.object;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

@Table(name = "categories")
public class Category extends Model {

    @Column(name = "name")
    private String name;

    public Category(String name) {
        this.name = name;
    }

    //
    public List<ItemsGroup> groups() {
        return getMany(ItemsGroup.class, "category");
    }

}
