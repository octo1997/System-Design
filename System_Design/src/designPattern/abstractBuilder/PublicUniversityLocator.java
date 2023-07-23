package designPattern.abstractBuilder;

public class PublicUniversityLocator extends AbstractUniversityLocator {

	@Override
	public AdmitCardGenerator getAdmitCard(String course) {
		// TODO Auto-generated method stub
		AdmitCardGenerator acg;
		switch (course) {
			case Courses.Math:
				acg = new NITAdmitCard();
				break;
			case Courses.CS:
				acg = new NIITAdmitCard();
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
				fg = new NITFeeGenerator();
				break;
			case Courses.CS:
				fg = new NIITFeeGenerator();
				break;
			default:
				fg = null;
				break;
		}
		return fg;
	}
}
