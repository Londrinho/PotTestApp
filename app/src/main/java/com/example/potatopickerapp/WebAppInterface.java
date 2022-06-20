package com.example.potatopickerapp;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

import com.example.potatopickerapp.model.Picker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class WebAppInterface {
    private static final String TAG = "WebAppInterface";
    Context mContext;

    WebAppInterface(Context c) {
        mContext = c;
    }


//    @JavascriptInterface
//    public String getFromAndroid()  {
//       return "This is from android.";
//    }

//    @JavascriptInterface
//    public String getFromAndroid() throws JSONException {
//
//        Picker pickerOne = new Picker();
//
//        Gson gson = new GsonBuilder().create();
//
//        String jsonPojo = gson.toJson(pickerOne);
//
//        JSONObject json = new JSONObject(jsonPojo);
//
//        json.toString();
//
//        return String.valueOf(json);
//
//    }

    @JavascriptInterface
    public String getFromAndroid() {

        Picker pickerThree = new Picker();

        Picker pickerTwo = new Picker();

        Picker pickerOne = new Picker();

//			Picker pickerList[] = {pickerOne, pickerTwo, pickerThree};
//
//			List<String> listOfPickersString = Arrays.asList(new String[3]);

        ArrayList<Picker> pickers = new ArrayList();
        pickers.add(pickerOne);
        pickers.add(pickerTwo);
        pickers.add(pickerThree);

        Gson gson = new GsonBuilder().create();
        String jsonObjArray = "";
        String jsonObj = gson.toJson(pickers);

        Log.w(TAG, "getFromAndroid: json string = " + jsonObj);

        return jsonObj;

//			for(Picker i: pickerList){
//
//				Gson gson = new GsonBuilder().create();
//
//				String jsonPojo = gson.toJson(i);
//
//				JSONObject json = new JSONObject(jsonPojo);
//
//				json.toString();
//
//				listOfPickersString.add(String.valueOf(json));
//
//			}
//
//			return listOfPickersString;

    }


}
