package com.chandu.Diaryapp.dao;

import java.util.List;

import com.chandu.Diaryapp.entities.Entry;

public interface EntryDaoInterface {
	
	public void save(Entry entry);
	public void update(Entry entry);
	public void delete(Entry entry);
	public Entry findById(int id);
	public List<Entry> findAll();
	public List<Entry> findByUserid(int id);

}
