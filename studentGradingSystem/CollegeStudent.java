package studentGradingSystem;

public class CollegeStudent extends Student{
	@Override
	double calculateAverage(double[] grades) {
		double sum = 0;
		for (double g : grades) {
			sum += g;
		}
		
		return sum / grades.length;
	}
}
