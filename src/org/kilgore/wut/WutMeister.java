package org.kilgore.wut;

public class WutMeister {

	public static void main(String[] args) {
		WutGetter wutGetter = new WutGetterImpl();
		System.out.println(wutGetter.canIGetAWut().getYourWut());

	}

}
