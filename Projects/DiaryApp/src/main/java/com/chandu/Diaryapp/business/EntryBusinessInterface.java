package com.chandu.Diaryapp.business;

import java.util.List;

import com.chandu.Diaryapp.entities.Entry;

public interface EntryBusinessInterface {

	
	public void save(Entry entry);
	public void update(Entry entry);
	public void delete(Entry entry);
	public Entry findById(int id);
	public List<Entry> findAll();
	public List<Entry> findByUserid(int id);

}
