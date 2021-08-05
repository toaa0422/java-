package Java8FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collected {
    List<String> collected= Stream.of("a","b","c").collect(Collectors.toList());
}
