package com.example.viewmodel2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> randomNumber;

    LiveData<String> generateRandomNumber(){
        if(randomNumber == null){
            randomNumber = new MutableLiveData<>();
            generate();
        }
        return randomNumber;
    }

    public void generate(){
        Random random = new Random();
        randomNumber.setValue(String.valueOf(random.nextInt(500)));
    }
}
