//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
//the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
//one is better.



package second;

public class PerformanceTest {
	public static void main(String[] args) {

        int iterations = 10000;

        // Test with StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sbf.append("AIET");
        }

        long endTimeBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " 
                + (endTimeBuffer - startTimeBuffer) + " ms");

        // Test with StringBuilder
        StringBuilder sbd = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sbd.append("AIET");
        }

        long endTimeBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " 
                + (endTimeBuilder - startTimeBuilder) + " ms");
    }
}
