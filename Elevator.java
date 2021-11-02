package task3;

import java.io.PrintStream;

public class Elevator {

	public static int current_Floor = 5;
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator(int dest_floor) {
		this.dest_Floor = dest_floor;
		System.out.println("*** Destination floor is: " + dest_Floor);

		State.Current_State = State.Idle;

		if (dest_Floor > current_Floor) {

			while (dest_Floor > current_Floor) {
				Go_up();

			}
		} else if (dest_Floor < current_Floor) {

			while (dest_Floor < current_Floor) {

				Go_down();
			}

		} 

		if (dest_Floor == current_Floor) {
			arrive_atFloor();
			exit();
		}
	}

	public void Go_up() {
		State.Current_State = State.Moving_up;
		current_Floor++;
        System.out.println("Moving up to floor " + current_Floor );
	}

	public void Go_down() {
		State.Current_State = State.Moving_down;
		current_Floor--;
		System.out.println("Moving down to floor " + current_Floor );
	}

	private void arrive_atFloor() {
		State.Current_State = State.Idle;
		 System.out.println("You arrived at floor " + current_Floor );

	}

	public void exit() {
		System.out.println("Exit on the destination floor");
	}

}
