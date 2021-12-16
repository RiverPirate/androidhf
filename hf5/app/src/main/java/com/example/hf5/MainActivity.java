package com.example.hf5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private View relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        registerForContextMenu(button);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();

        AdapterView.AdapterContextMenuInfo a=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        SpannableString s;
        switch (item.getItemId()){
            case R.id.p:
                relativeLayout.setBackgroundResource(Color.GREEN);
                break;
            case R.id.z:
                relativeLayout.setBackgroundResource(Color.RED);
                break;
            case R.id.k:
                relativeLayout.setBackgroundResource(Color.BLUE);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
        return super.onContextItemSelected(item);
    }
}