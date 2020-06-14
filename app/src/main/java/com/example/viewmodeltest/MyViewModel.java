package com.example.viewmodeltest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> liveData;


    public MutableLiveData<Integer> getLiveData() {
        if (liveData == null) {
            liveData = new MutableLiveData<>();
            liveData.setValue(0);
        }
        return liveData;
    }

    public void add(int n) {
        if (liveData != null&&liveData.getValue()!=null) {
            liveData.setValue(liveData.getValue() + n);
        }
    }
}
