package com.mathemagicians.hus;

import android.content.Intent;
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
        switch(category.getCheckedRadioButtonId()) {
            case R.id.cate1:
                Intent i1 = new Intent(CategoryActivity.this, FormEmployer.class);
                startActivity(i1);
                finish();
            case R.id.cate2:
                Intent i2 = new Intent(CategoryActivity.this, FormEmployee.class);
                startActivity(i2);
                finish();
            case R.id.cate3:
                Intent i3 = new Intent(CategoryActivity.this, MainActivity.class);
                startActivity(i3);
                finish();
        }
    }
}
