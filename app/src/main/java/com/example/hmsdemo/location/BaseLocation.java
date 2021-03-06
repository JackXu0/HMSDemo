package com.example.hmsdemo.location;

import android.location.Location;

import com.example.hmsdemo.BaseActivity;

public abstract class BaseLocation {
    onLocationCallBack callBack;
    BaseActivity baseActivity;

    public abstract void getCurrentLocation();
    public abstract void getLocationAvailability();
    public abstract void  updatesLocation();
    public abstract void  removeLocationUpdates();
    public abstract void setLocationRequest();
    public abstract void setUpLocationCallBack();

    public interface onLocationCallBack {
        void callBack (Location location);
    }

    public void setonLocationCallBack(onLocationCallBack onLocationCallBack) {
        this.callBack = onLocationCallBack;
    }
}
