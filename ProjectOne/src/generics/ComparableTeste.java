package generics;

import java.util.TreeSet;

public class ComparableTeste {
  public static void main(String[] args) {
    TreeSet<Integer> nums = new TreeSet<>();

    nums.add(12);
    nums.add(56);
    nums.add(76);
    nums.add(56);
    nums.add(87);
    nums.add(45);
    nums.add(34);
    nums.add(-44);

    for(Integer n: nums) {
      System.out.println(n);
    }
  }
}
