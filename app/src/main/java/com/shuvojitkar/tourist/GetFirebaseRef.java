package com.shuvojitkar.tourist;

import com.google.firebase.database.FirebaseDatabase;
/**
 * Created by SHOBOJIT on 7/6/2017.
 */

public class GetFirebaseRef {
    private static  FirebaseDatabase mFirebaseDatabase;

    public static FirebaseDatabase GetDbIns(){
        if (mFirebaseDatabase ==null){
            mFirebaseDatabase =FirebaseDatabase.getInstance();
            mFirebaseDatabase.setPersistenceEnabled(true);
            return mFirebaseDatabase;
        }
        return mFirebaseDatabase;
    }


}
