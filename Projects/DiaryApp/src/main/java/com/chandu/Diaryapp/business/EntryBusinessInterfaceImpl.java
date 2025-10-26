package com.chandu.Diaryapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandu.Diaryapp.dao.EntryDaoInterface;
import com.chandu.Diaryapp.entities.Entry;

@Component
public class EntryBusinessInterfaceImpl implements EntryBusinessInterface {

	@Autowired
	private EntryDaoInterface entryDaoInterface;
	
	@Transactional(readOnly = false)
	public void save(Entry entry) {
		// TODO Auto-generated method stub
		entryDaoInterface.save(entry);

	}

	@Transactional(readOnly = false)
	public void update(Entry entry) {
		// TODO Auto-generated method stub
		entryDaoInterface.update(entry);

	}

	@Transactional(readOnly = false)
	public void delete(Entry entry) {
		// TODO Auto-generated method stub
		entryDaoInterface.delete(entry);

	}

	public Entry findById(int id) {
		// TODO Auto-generated method stub
		return entryDaoInterface.findById(id);
	}

	public List<Entry> findAll() {
		// TODO Auto-generated method stub
		return entryDaoInterface.findAll();
	}

	public EntryDaoInterface getDaoInterface() {
		return entryDaoInterface;
	}

	public void setDaoInterface(EntryDaoInterface daoInterface) {
		this.entryDaoInterface = daoInterface;
	}

	public List<Entry> findByUserid(int id) {
		// TODO Auto-generated method stub
		return entryDaoInterface.findByUserid(id);
	}

	


}
