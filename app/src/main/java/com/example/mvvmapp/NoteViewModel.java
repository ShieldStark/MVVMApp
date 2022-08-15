package com.example.mvvmapp;

import android.app.Application;

import androidx.annotation.NonNull;
import  androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel{

    private NoteRepositiory repositiory;

    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        repositiory=new NoteRepositiory(application);
        allNotes=repositiory.getAllNotes();
    }
    public void insert(Note note){
        repositiory.insert(note);
    }
    public void delete(Note note){
        repositiory.delete(note);
    }
    public void update(Note note){
        repositiory.update(note);
    }
    public void deleteAllNotes(){
        repositiory.deleteAllNotes();
    }
    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }
}
