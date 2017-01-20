package com.mathemagicians.hus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class CategoryActivity extends AppCompatActivity {

    RadioGroup category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        category = (RadioGroup) findViewById(R.id.category);
        category.check(R.id.cate1);
    }

    public void next(View view) {

    }
}
