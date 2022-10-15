package com.kunal.generics;

import java.util.Arrays;
import java.util.List;

public class WildCard<T extends Number> {
  private Object[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0;

  public WildCard() {
    data = new  Object[DEFAULT_SIZE];
  }
  public void getList(List<? extends Number> list){

  }
  public void add(T num){
    if (isFull()){
      resize();
    }
    data[size++] = num;
  }

  private void resize() {
    Object[] temp = new Object[data.length * 2];
    // copy the current items in the new array
    for (int i = 0; i < data.length ; i++) {
temp[i] = data[i];
    }
data = temp;
  }

  private boolean isFull() {

    return size == data.length;
  }
public T remove(){
    T removed = (T)(data[--size]);
    return removed;
}
public T get(int index) {
    return (T)data[index];
}
public int size() {
    return size;
  }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void set(int index, int value){
    data[index] = value;
  }

    public static void main(String[] args) {
   WildCard<Integer> list = new WildCard<>();
//   list.add(4);
//   list.add(5);
//   list.add(9);
    for (float listt = 0.0f; listt < 14 ; listt++) {
    //  list.add(list * 3);
    }
    System.out.println(list);
list.add(45);

  }

}
