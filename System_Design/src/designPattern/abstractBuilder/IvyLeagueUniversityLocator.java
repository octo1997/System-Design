package designPattern.abstractBuilder;

public class IvyLeagueUniversityLocator extends AbstractUniversityLocator {

	@Override
	public AdmitCardGenerator getAdmitCard(String course) {
		// TODO Auto-generated method stub
		AdmitCardGenerator acg;
		switch (course) {
			case Courses.Math:
				acg = new IITAdmitCard();
				break;
			case Courses.CS:
				acg = new IIITAdmitCard();
				break;
			default:
				acg = null;
				break;
		}
		return acg;
	}

	@Override
	public FeesGenerator generateFees(String course) {
		FeesGenerator fg;
		switch (course) {
			case Courses.Math:
				fg = new IITFeeGenerator();
				break;
			case Courses.CS:
				fg = new IIITFeeGenerator();
				break;
			default:
				fg = null;
				break;
		}
		return fg;
	}

}
