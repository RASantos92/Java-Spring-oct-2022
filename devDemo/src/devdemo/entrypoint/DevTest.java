package devdemo.entrypoint;

import devdemo.entrypoint.models.Developer;

public class DevTest {

	public static void main(String[] args) {
        Developer dev1 = new Developer();
        Developer dev2 = new Developer("Bobby", 2 , 12.5);
        Developer dev3 = new Developer("Martha", 30 , 4);


        dev1.displayStatus();
        System.out.println("**************************\n");
        dev2.displayStatus();
        System.out.println("**************************\n");
        dev3.displayStatus();

        System.out.println(Developer.getDevCount());
        System.out.println(Developer.getTotalYearsOfEXP());

	}

}
