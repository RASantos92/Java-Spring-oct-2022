package devdemo.entrypoint.models;

import java.util.ArrayList;

public class Developer {
    // Attributes
    private String name;
    private int yearsOfExperience;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private static int devCount;
    private static int totalYearsOfEXP;
    private static int totalProjects;

    //constructors
    public Developer(){
        this.name = "somebody";
        this.languages = new ArrayList<String>();
        devCount++;
    }

    public Developer(String name, int yearsOfExperience,double hoursOfSleep){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        devCount++;
        totalYearsOfEXP += yearsOfExperience;
    }
	
	// methods
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("yearsOfExperience: " + this.yearsOfExperience);
        System.out.println("hoursOfSleep: " + this.hoursOfSleep);
        System.out.println("languages: " + this.languages);
    }

    
    //getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public double getHoursOfSleep() {
		return hoursOfSleep;
	}

	public void setHoursOfSleep(double hoursOfSleep) {
		this.hoursOfSleep = hoursOfSleep;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static void setDevCount(int devCount) {
		Developer.devCount = devCount;
	}

	public static int getTotalYearsOfEXP() {
		return totalYearsOfEXP;
	}

	public static void setTotalYearsOfEXP(int totalYearsOfEXP) {
		Developer.totalYearsOfEXP = totalYearsOfEXP;
	}

	public static int getTotalProjects() {
		return totalProjects;
	}

	public static void setTotalProjects(int totalProjects) {
		Developer.totalProjects = totalProjects;
	}
	
	
	
	

}
