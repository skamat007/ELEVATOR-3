package ELEVATOR;
import java.io.*;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Panel_Button implements Button{
	ArrayList<Button_no> panel_bt=new ArrayList<Button_no>() ;
	
	
	Panel_Button(){
	for(int i=0;i<=5;i++)
		panel_bt.add(new Button_no(i));  
	}
	

	@Override
	public boolean button_pressed() {
		return true;
	}

	void panel(){
		java.util.Iterator<Button_no> itr=this.panel_bt.iterator();
		System.out.println("Enter the number from panel");
		while(itr.hasNext()){
			Button_no bn=itr.next();
			System.out.println(" "+bn.button_no);
		}
		
	}
	
	
	
}
	
	
	
	
	
	

