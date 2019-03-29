package com.github.mortezaj8.fcmserverexample;

import com.github.mortezaj8.fcmserver.FirebaseNotification;

/**
 * created by: Morteza
 * company: mobin
 * package: com.github.mortezaj8.fcmserverexample
 * project name:  example fcm-server
 * 27 March 2019
 **/


public class FirebaseHandler extends FirebaseNotification {


    private static FirebaseHandler firebaseHandler;

    public static FirebaseHandler getInstance(){
        if(FirebaseHandler.firebaseHandler == null){
            FirebaseHandler.firebaseHandler = new FirebaseHandler();
        }
        return FirebaseHandler.firebaseHandler;
    }


    @Override
    protected String getFirebaseRemoteToken() {
        return "AAAAgGywo-E:APA91bFJ4953GKm2TZSNrbHXm0O3zEWR5WuyOjxa8chuKtVqhuUTcD8rg9qmrpeDdb3qDZdNWR18pIKMFuKbXUcxa8JxJyqOVLbo7x4NVBVUXFlGRj5qqPi7ftG07QuRAN_oJvJyzk-S";
    }

}
