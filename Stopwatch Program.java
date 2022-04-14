import java.util.Scanner;

import Utility.Util;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Press 1 and enter to stop ");
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);

		System.out.println("Go !!!!!!!....");

         //to calculate elapsed time
		double elapsedTime = Util.stopwatch();

		System.out.println("Reaction time : " + elapsedTime + " ms");
		System.out.println("Reaction time : " + ( elapsedTime / 1000) % 60 + " sec");
	}
}