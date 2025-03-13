import java.util.*;

public class Appearances {
	
	/**
	 * Returns the number of elements that appear the same number
	 * of times in both collections. Static method. (see handout).
	 * @return number of same-appearance elements
	 */
	public static <T> int sameCount(Collection<T> a, Collection<T> b) {


		Map<T, Integer> freqA = getFrequencyMap(a);
		Map<T, Integer> freqB = getFrequencyMap(b);

		int count = 0;

		for (T key : freqA.keySet()) {
			if (freqB.containsKey(key) && freqA.get(key).equals(freqB.get(key))) {
				count++;
			}
		}

		return count;
	}
	}
	
}
