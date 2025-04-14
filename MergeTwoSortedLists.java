package com.example.hubspotinterview;

import java.util.ArrayList;
import java.util.List;


public class MergeTwoSortedLists {

    public static void main(String[] args) throws Exception {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(3);
        a.add(5);

        b.add(2);
        b.add(6);
        b.add(8);
        b.add(9);
        List result = mergeTwoLists(a, b, 3);
        System.out.println();
    }

    public static List<Integer> mergeTwoLists(List<Integer> a, List<Integer> b, int maxResultLength) throws Exception {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (result.size() < maxResultLength && i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }

        while (result.size() < maxResultLength && i < a.size()) {
            result.add(a.get(i));
            i++;
        }

        while (result.size() < maxResultLength && j < b.size()) {
            result.add(b.get(j));
            j++;
        }

        return result;
    }
}
