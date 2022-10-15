package com.kunal.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
  private Object[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0;

  public CustomGenArrayList() {
    this.data = new  Object[DEFAULT_SIZE];
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
   CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
//   list.add(4);
//   list.add(5);
//   list.add(9);
    for (int listt = 0; listt < 14 ; listt++) {
      list.add(listt * 3);
    }
    System.out.println(list);
list.add(45);

  }

}
