package com.example.recyclerviewapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.Note;
import com.example.recyclerviewapp.NoteAdapter;
import com.example.recyclerviewapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Note> noteList = new ArrayList<>();
        noteList.add(new Note(1, "2024-12-21 18:00", "Перва нотатка"));
        noteList.add(new Note(2, "2024-12-21 18:30", "Друга нотатка"));
        noteList.add(new Note(3, "2024-12-21 19:00", "Третя нотатка"));
        noteList.add(new Note(4, "2024-12-21 19:30", "Четверта нотатка"));
        noteList.add(new Note(5, "2024-12-21 20:00", "П'ята нотатка"));
        noteList.add(new Note(6, "2024-12-21 20:30", "Шоста нотатка"));

        NoteAdapter noteAdapter = new NoteAdapter(noteList);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(noteAdapter);
    }
}