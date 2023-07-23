package designPattern.abstractBuilder;

public abstract class AbstractUniversityLocator{
	private final static int cutoff = 100;
	public static AbstractUniversityLocator getUniversity(int score) {
		if(score > cutoff) return new IvyLeagueUniversityLocator();
		else return new PublicUniversityLocator();
		
	}
	
	public abstract AdmitCardGenerator getAdmitCard(String course);
	public abstract FeesGenerator generateFees(String course);
}