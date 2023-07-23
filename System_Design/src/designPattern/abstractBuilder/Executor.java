package designPattern.abstractBuilder;

public class Executor{
	
	public static void main(String[] args) {
		int[] score = {10, 90, 100, 110};
		
		for(int i = 0; i < score.length; i++) {
			AbstractUniversityLocator abu = AbstractUniversityLocator.getUniversity(score[i]);
			AdmitCardGenerator acgm = abu.getAdmitCard(Courses.Math);
			AdmitCardGenerator acgc = abu.getAdmitCard(Courses.CS);
			
			System.out.print(acgm.getClass().toString() + " " + acgc.getClass().toString());
			System.out.println();
			
			FeesGenerator fgm = abu.generateFees(Courses.Math);
			FeesGenerator fgc = abu.generateFees(Courses.CS);
			System.out.print(fgm.getFees()); System.out.print(" ");;System.out.print(fgc.getFees());
			System.out.println();
			System.out.println();
		}
	}
}