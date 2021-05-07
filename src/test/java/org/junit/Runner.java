package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {

	public void runCheck() {

		Result runClasses = JUnitCore.runClasses(A.class, B.class, C.class);

		System.out.println("Get run count " + runClasses.getRunCount());
		System.out.println("Get Ignore Count " + runClasses.getIgnoreCount());
		System.out.println("Get Run Time " + runClasses.getRunTime());
		System.out.println("Get Failure Count " + runClasses.getFailureCount());
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {

			System.out.println("Get failure details " + failure);

		}

	}

}
