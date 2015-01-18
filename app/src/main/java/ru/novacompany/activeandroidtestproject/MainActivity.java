package ru.novacompany.activeandroidtestproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import ru.novacompany.activeandroidtestproject.model.object.Category;
import ru.novacompany.activeandroidtestproject.model.object.ItemsGroup;
import ru.novacompany.activeandroidtestproject.model.object.Item;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Category category = new Category("CategoryA");
        ItemsGroup itemsGroupA = new ItemsGroup("GroupA", category);
        ItemsGroup itemsGroupB = new ItemsGroup("GroupB", category);
        Item item1 = new Item("ItemA", itemsGroupA);
        Item item2 = new Item("ItemB", itemsGroupA);
        Item item3 = new Item("ItemC", itemsGroupA);
        Item item4 = new Item("ItemD", itemsGroupB);
        Item item5 = new Item("ItemE", itemsGroupB);
        Item item6 = new Item("ItemF", itemsGroupB);

        category.save();
        itemsGroupA.save();
        itemsGroupB.save();
        item1.save();
        item2.save();
        item3.save();
        item4.save();
        item5.save();
        item6.save();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
