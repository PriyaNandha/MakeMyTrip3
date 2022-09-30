package org.task.mini;

public class TaskOne extends DayOne{

	public TaskOne() {

	
	}

	public static void main(String[] args) {
		task(); // called method  without obj
		taskO("Hi"); //called method  without obj and with passing arguments
		DayOne obj=new DayOne();
		obj.taskT(); // called method  with obj
	}
}
