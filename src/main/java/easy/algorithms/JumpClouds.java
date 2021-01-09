package easy.algorithms;

public class JumpClouds {

	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int cloudIndex = 0;

		while (cloudIndex < c.length - 1) {
			jumps++;
			if (cloudIndex < c.length - 2 && c[cloudIndex + 2] != 1) { // double jump
				cloudIndex += 2;
			} else { // single jump
				cloudIndex++;

			}
		}
		return jumps;
	}

	public static void main(String[] args) {
		int[] clouds = { 0, 0, 0, 1, 0, 0 };
		jumpingOnClouds(clouds);
	}
}
