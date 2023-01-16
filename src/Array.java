import java.util.ArrayList;
import java.util.List;

public class Array {
	public static <T> List<T> compare(T[] first, T[] second) {
		List<T> list = new ArrayList<>();

		for(int i = 0; i < first.length; i++) {
			T currFirst = first[i];

			for(int j = 0; j < second.length; j++) {
				T currSecond = second[j];

				if(currFirst.equals(currSecond)) {
					list.add(currFirst);
				}
			}
		}

		return list;
	}
}
