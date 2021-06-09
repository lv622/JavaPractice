package JavaPractice;

public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = { { 90, 90, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };
		int[] sum = new int[5];
		float[] avg = new float[5];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[j].length; j++) {
				sum[i] += score[i][j];
			}
			avg[i] = sum[i] / score.length;

			System.out.println("ID=" + i + ", 합계=" + sum[i] + ", 평균=" + avg[i]);
		}
	}

}
