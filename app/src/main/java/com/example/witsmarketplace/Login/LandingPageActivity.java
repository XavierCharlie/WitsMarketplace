package com.example.witsmarketplace.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Spinner;

import com.example.witsmarketplace.MainActivity;
import com.example.witsmarketplace.R;

public class LandingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

//        Spinner categories_spinner = (Spinner) findViewById(R.id.categories);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(LandingPage.this,
//                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.departments));
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        categories_spinner.setAdapter(adapter);

        ImageButton cat =(ImageButton)findViewById(R.id.btn_categories);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);

            }
        });

    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

        public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.categories_menu, popupMenu.getMenu());
        popupMenu.show();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.categories_menu, menu);
//        return true;
//    }
}