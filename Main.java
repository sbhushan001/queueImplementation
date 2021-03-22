package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
//Implementation using Array
class myQueue<T>{
    private T arr[] = (T[]) new Object[5];
    private int front=0,rear=0,size=0;
    void add(T data){
        if(isFull()) {
            System.out.println("Queue is Full");
        }else {
            arr[ rear % arr.length ] = data;
            rear += 1;
            size += 1;
        }
    }
    T peek(){
        if(isEmpty()) return null;
        return arr[front%arr.length];
    }
    T poll(){
        if(isEmpty()) return null;
        T data = arr[front%arr.length];
        arr[front%arr.length] = null;
        front+=1;
        size-=1;
        return data;
    }
    void print(){
        for(int i=front;i<rear;i++){
            System.out.print(arr[i%arr.length]+" ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(size()==0) return true;
        return false;
    }
    boolean isFull(){
        if(size()==arr.length) return true;
        return false;
    }
    int size(){
        return size;
    }
}