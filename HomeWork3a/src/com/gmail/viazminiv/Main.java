package com.gmail.viazminiv;

public class Main {

	public static void main(String[] args) {
		
		Group gr = new Group();
		try {
			gr.addStudent(new Student("Ivanov", 22, 80, "EK-1"));
			gr.addStudent(new Student("Sidorov", 19, 73, "EK-1"));
			gr.addStudent(new Student("Antonov", 17, 90, "EK-1"));
			gr.addStudent(new Student("Makarov", 20, 65, "EK-1"));
			gr.addStudent(new Student("Shevchenko", 19, 73, "EK-1"));
			gr.addStudent(new Student("Medvedev", 18, 95, "EK-1"));
			gr.addStudent(new Student("Krylov", 18, 78, "EK-1"));
			gr.addStudent(new Student("Smirnov", 25, 63, "EK-1"));
			gr.addStudent(new Student("Lazarev", 21, 62, "EK-1"));
			gr.addStudent(new Student("Sokolov", 30, 83, "EK-1"));
			
		}catch (MyException e) {
			System.out.println(e.getMessage());	
		}
		
		System.out.println(gr);
		
		System.out.println();
		
		Student stud = gr.searchStudent("Ivanov");
		
		System.out.println(stud);
		
		System.out.println();
		
		

	}

}
