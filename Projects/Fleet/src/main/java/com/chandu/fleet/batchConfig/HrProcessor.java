package com.chandu.fleet.batchConfig;

import org.springframework.batch.item.ItemProcessor;

import com.chandu.fleet.entity.Hr;

public class HrProcessor implements ItemProcessor<Hr, Hr> {

	@Override
	public Hr process(Hr item) throws Exception {
		// TODO Auto-generated method stub
		
		//logic 
		return item;
	}
	 

}
