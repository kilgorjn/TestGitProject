package org.kilgore.wut;

public class WutGetterImpl implements WutGetter {

	@Override
	public Wut canIGetAWut() {
		// TODO Auto-generated method stub
		return new Wut() {
			
			@Override
			public String getYourWut() {
				return "Wut Wut";
			}
		};
	}

}
