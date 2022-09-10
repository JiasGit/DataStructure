package com.example.myapplication;

import static android.util.Log.d;

import android.os.UserManager;
import android.util.Log;

import java.lang.reflect.Array;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class ArrayD{
    String[] array = new String[5];
    int count=0;

    public void insert(String str){

        if(count == array.length)
        {
            String[] arrayNew = new String[count*2];
            for (int i=0; i<array.length; i++) {
                arrayNew[i] = array[i];
            }
            array= arrayNew;
        }
            array[count] = str;
            count++;
    }

    public int getCount() {
        return count;
    }
    public String atPosition(int index){
        return array[index];
    }
    public void  removeAt(int index) {

        if(index>=0&&index<count) {
            for (int i = index; i < count; i++)
                array[i] = array[i + 1];
            count--;
        }else{
            Log.d("MainActivity", "illeagal input");
            }
    }
}
