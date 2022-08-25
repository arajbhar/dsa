package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Integer> arrayToSort = new ArrayList<Integer>();
		arrayToSort.add(23);
		arrayToSort.add(21);
		arrayToSort.add(27);
		arrayToSort.add(19);
		arrayToSort.add(44);
		arrayToSort.add(33);


		ExecutorService executorService = Executors.newCachedThreadPool();
		Sorter sorter = new Sorter(arrayToSort,executorService);

		Future<List<Integer>> sortedArrayFuture = executorService.submit(sorter);

		List<Integer> finalSortedArray = sortedArrayFuture.get();

		for (Integer i : finalSortedArray) {
			System.out.println(i);
		}

	}

}
