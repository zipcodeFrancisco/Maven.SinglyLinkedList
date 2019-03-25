package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {



    @Test
    public void addTest(){
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        Integer expected1 = 11;
        Integer expected2 = 22;
        Integer expected3 = 33;
        singlyLinkedList.add(expected1);
        singlyLinkedList.add(expected2);
        singlyLinkedList.add(expected3);

        Integer actual1 = singlyLinkedList.head.data;
        Integer actual2 = singlyLinkedList.head.next.data;
        Integer actual3 = singlyLinkedList.head.next.next.data;

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException(){
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);

        Assert.fail(String.valueOf(singlyLinkedList.head.next.data));
    }

    @Test
    public void testRemoveNodeHead(){
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        int expected = 22;
        singlyLinkedList.add(11);
        singlyLinkedList.add(expected);

        singlyLinkedList.remove(0);

        int actual = singlyLinkedList.head.data;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testRemoveNodeNoHead() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        int expected = 11;
        singlyLinkedList.add(expected);
        singlyLinkedList.add(22);

        singlyLinkedList.remove(1);

        int actual = singlyLinkedList.head.data;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsTrue() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);
        singlyLinkedList.add(22);
        singlyLinkedList.add(33);

        boolean actual = singlyLinkedList.contains(22);

        Assert.assertTrue(actual);
    }

    @Test
    public void testContainsFalse() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);
        singlyLinkedList.add(22);
        singlyLinkedList.add(33);

        boolean actual = singlyLinkedList.contains(44);

        Assert.assertFalse(actual);
    }

    @Test
    public void testContainsTrueString() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add("aa");
        singlyLinkedList.add("bb");
        singlyLinkedList.add("cc");

        boolean actual = singlyLinkedList.contains("bb");

        Assert.assertTrue(actual);
    }

    @Test
    public void testContainsFalseString() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add("aa");
        singlyLinkedList.add("bb");
        singlyLinkedList.add("cc");

        boolean actual = singlyLinkedList.contains("iCloud");

        Assert.assertFalse(actual);
    }


    @Test
    public void testFind() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);
        singlyLinkedList.add(22);
        singlyLinkedList.add(33);

        int actual = singlyLinkedList.find(22);

        Assert.assertEquals(1,actual);
    }

    @Test
    public void testFindNotFinded() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);
        singlyLinkedList.add(22);
        singlyLinkedList.add(33);

        int actual = singlyLinkedList.find(66);

        Assert.assertEquals(-1,actual);
    }

    @Test
    public void testSize() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);
        singlyLinkedList.add(22);
        singlyLinkedList.add(33);

        int actual = singlyLinkedList.size();

        Assert.assertEquals(3,actual);
    }

    @Test
    public void testGet() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);
        singlyLinkedList.add(22);
        singlyLinkedList.add(33);

        int actual = singlyLinkedList.get(1);

        Assert.assertEquals(22,actual);
    }

    @Test(expected = NullPointerException.class)
    public void testGetNullPointerException(){
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(11);

        Assert.fail(String.valueOf(singlyLinkedList.get(99)));
    }

    @Test
    public void testCopy() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        int expected1 = 11;
        int expected2 = 22;
        int expected3 = 33;
        singlyLinkedList.add(expected1);
        singlyLinkedList.add(expected2);
        singlyLinkedList.add(expected3);

        SinglyLinkedList<Integer> copySLL = singlyLinkedList.copy();

        int actual1 = copySLL.get(0);
        int actual2 = copySLL.get(1);
        int actual3 = copySLL.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test
    public void testSort() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList();

        int expected1 = 22;
        int expected2 = 11;
        int expected3 = 33;
        singlyLinkedList.add(expected1);
        singlyLinkedList.add(expected2);
        singlyLinkedList.add(expected3);

        singlyLinkedList.sort();


//        Assert.assertEquals(expected1,actual1);
//        Assert.assertEquals(expected2,actual2);
//        Assert.assertEquals(expected3,actual3);
    }

}
