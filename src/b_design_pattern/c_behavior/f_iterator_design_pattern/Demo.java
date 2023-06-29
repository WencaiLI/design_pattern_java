package b_design_pattern.c_behavior.f_iterator_design_pattern;

/**
 * @author liwencai
 * @since 2023/6/29
 */
public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.currentElement());
            iterator.next();
        }
    }
}
