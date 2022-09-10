package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        ArrayD myArray = new ArrayD();
        myArray.insert("apple");
        myArray.insert("orange");
        myArray.insert("pear");
        myArray.insert("mango");
        myArray.insert("banana");
        myArray.insert("watermelon");
        myArray.removeAt(-1);
        for(int i =0; i<myArray.getCount(); i++){
        Log.d("MainActivity", "arraylist are " + myArray.atPosition(i));}


        LinkedList List = new LinkedList();
        List.addLast(20);
        List.addLast(30);
        List.addLast(40);
        List.addFirst(10);
        Log.d("MainActivity", " " + List.contains(10));
        Log.d("MainActivity", " " + List.contains(50));
        List.removeFirst();
        List.removeLast();

        Log.d("MainActivity", " " + List.valueOf(0));
        Log.d("MainActivity", " " + List.valueOf(1));
        Log.d("MainActivity", " " + List.valueOf(2));
        Log.d("MainActivity", " " + List.valueOf(-1));

 */

        int a, b, temp;
        a= b =1;
        temp = 0;
        for (int i=0; i<3; i++){
            temp = a + b;
            b=a;
            a=temp;
        }
        Log.d("MainActivity", " " + temp);



    }
}