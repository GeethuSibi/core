package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.inputdata.AddCB_data;
import com.locators.AddCB_elements;

public class AddCB {

	public void addcb_valid() throws InterruptedException
	{
		Keywords.click_element(AddCB_elements.addbtn);
		
		Keywords.wait_for_xpath(AddCB_elements.name);
		Keywords.enter_text(AddCB_elements.name, AddCB_data.name);

		Keywords.wait_for_xpath(AddCB_elements.username);
		Keywords.enter_text(AddCB_elements.username, AddCB_data.username);
		
		Keywords.wait_for_xpath(AddCB_elements.country);
		Keywords.dropdown_click(AddCB_elements.country, AddCB_data.country);
		
		Keywords.wait_for_xpath(AddCB_elements.email);
		Keywords.enter_text(AddCB_elements.email, AddCB_data.email);		

		Keywords.click_element(AddCB_elements.ok);	
		
		
	}
}
