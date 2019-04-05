package testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * STREAM: A stream is something like an iterator. The values "flow past"
 * (analogy to a stream of water) and then they're gone. A stream can only be
 * traversed once, then it's used up. Streams may also be infinite.
 * 
 * FILTER:stateless predicate to apply to each element to determine if it should
 * be included.
 * 
 * Streams can be sequential or parallel. They start off as one and may be
 * switched to the other using stream.sequential() or stream.parallel(). The
 * actions of a sequential stream occur in serial fashion on one thread. The
 * actions of a parallel stream may be happening all at once on multiple
 * threads.
 * 
 * Stream operations are either intermediate or terminal. Intermediate
 * operations return a stream so we can chain multiple intermediate operations
 * without using semicolons. Terminal operations are either void or return a
 * non-stream result. Filter, map and sorted are intermediate operations whereas
 * forEach is a terminal operation.
 * 
 *         http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */


public class StreamTest {
	public static void main(String[] args) {

		// Example 1:
		List<String> myList = Arrays.asList("a2", "a1", "b1", "c2", "c1");

		// FILTER:stateless predicate to apply to each element to determine if
		// it should be included

		myList
			.stream()
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		

		// C1
		// C2
		
		System.out.println("Example 2:==================");
		
		// Just use Stream.of() to create a stream from a bunch of object
		// references.
		
		Stream.of("a1", "a2", "a3", "a1")
			.distinct()
			.forEach(System.out::println);
		
		// a1
		// a2
		// a3
		
		System.out.println("Example 3:==================");
		/**
		 * Besides regular object streams Java 8 ships with special kinds of
		 * streams for working with the primitive data types int, long and
		 * double. As you might have guessed it's IntStream, LongStream and
		 * DoubleStream.
		 * 
		 * IMP: primitive streams support the additional terminal aggregate
		 * operations sum() and average()
		 * 
		 * Map: return IntStream here
		 */
		
		Arrays.stream(new int[] { 1, 2, 3 })
				.map(n -> 2 * n + 1)
				.average()
				.ifPresent(System.out::println);

	}
}
