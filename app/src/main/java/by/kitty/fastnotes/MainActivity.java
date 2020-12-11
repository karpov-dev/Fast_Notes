package by.kitty.fastnotes;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import by.kitty.fastnotes.Adapters.RecyclerViewAdapters.NotesAdapter;
import by.kitty.fastnotes.Model.Note;

public class MainActivity extends AppCompatActivity {
    List<Note> noteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initData();
        RecyclerView notesViewList = (RecyclerView) findViewById(R.id.notes_list);
        NotesAdapter notesAdapter = new NotesAdapter(this, this.noteList);
        notesViewList.setAdapter(notesAdapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initData() {
        noteList.add(new Note("1", "Hello, World!", "Hello fucking world"));
        noteList.add(new Note("2", "Test Note!", "Fucking test note"));
        noteList.add(new Note("3", "Last Element", "fuck"));
    }
}