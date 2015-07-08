package ELEVATOR;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Building {	
Elevator ele;  //ELEVATOR OBJECT
ArrayList<Floor> Fl=new ArrayList<Floor>(); //Floor Object	
Floor pos;
	Building(){
		for(int i=0;i<=5;i++)	
		Fl.add(new Floor(i));
		ele=new Elevator(0);
		 pos=new Floor(set_pos());
//System.out.println(pos.floor_no);
	}


int set_pos()
{
	double pos1=Math.random()*10;
	int pos2;
	pos2=(int)pos1;
//System.out.println("Pos2 is "+pos2);
	while(pos2==0||pos2>5){
		 pos1=Math.random()*10;
		 pos2=(int)pos1;
}
	System.out.println("Your position is "+pos2);

	return pos2;

	}


int set_panel()
{
	double pos1=Math.random()*10;
	int pos2;
	pos2=(int)pos1;
//System.out.println("Pos2 is "+pos2);
	while(this.pos.floor_no==pos2||pos2>5 ){
		 pos1=Math.random()*10;
		 pos2=(int)pos1;
}
	System.out.println("You Have Pressed  "+pos2);
	return pos2;

	}


void call_elevator(){
	if(this.pos.FB.button_pressed()==true)
	{
		System.out.println("Elevator is at Floor "+ele.Ele_floor.floor_no);
		while(this.pos.floor_no!=ele.Ele_floor.floor_no)
		{
		ele.Ele_floor.floor_no++;	
		System.out.println("Elevator is at Floor "+ele.Ele_floor.floor_no);
		}
		ele.mssg();
		System.out.println(ele.Ele_door.Door_open());
		System.out.println(ele.Ele_door.Door_close());	
		ele.pl.panel();
		Floor me=new Floor(set_panel());
		if(me.floor_no>ele.Ele_floor.floor_no)
			ele.move_up(ele.Ele_floor, me);
		else if(me.floor_no<ele.Ele_floor.floor_no)
			ele.move_down(ele.Ele_floor, me);
		
	}

//ele.move_up(ele.Ele_floor,new Floor(2));	
	
}




}



