package ELEVATOR;

public class Elevator {
Floor Ele_floor;
Panel_Button pl=new Panel_Button();	
Elevator_door Ele_door=new Elevator_door()	;

Elevator(int k){
	Ele_floor=new Floor(k) ;	
}
	
void Elevator_inside(){
	pl.panel();
}


void move_up(Floor src,Floor dest){
while(src.floor_no!=dest.floor_no)
{
src.floor_no++;
System.out.println("Elevator is at floor "+src.floor_no);
}
System.out.println(Ele_door.Door_open());
System.out.println(Ele_door.Door_close());	
}


void move_down(Floor src,Floor dest){
while(src.floor_no!=dest.floor_no)
{
src.floor_no--;
System.out.println("Elevator is at floor "+src.floor_no);
}
System.out.println(Ele_door.Door_open());
System.out.println(Ele_door.Door_close());	
}


	
	
void mssg(){
	System.out.println("Elevator has Arrived");
	
	
}	
	
	
}


