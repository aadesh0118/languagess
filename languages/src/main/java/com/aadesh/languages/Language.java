package com.aadesh.languages;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.Toast;

import com.aadesh.languages.enums.Constants;

import java.util.Locale;

/**
 * Created by test on 3/22/2018.
 */

public class Language {

    private static Language language;
    private Context context;
    private Constants constants;


    public static Language init(){
        language = new Language();
        return language;
    }

    public Language with(Context context){
        this.context = context;
        return this;
    }

    public Language setMessage(Constants constants){
        this.constants = constants;
        return this;
    }



    public void show(){

        Toast toast = Toast.makeText(context, "message", Toast.LENGTH_SHORT);

        String languageToLoad = "en";

        if (constants == Constants.ENGLISH){
            languageToLoad = "en";
        }else if (constants == Constants.HINDI){
            languageToLoad = "hi";
        }else if (constants == Constants.FRENCH){
            languageToLoad = "fr";
        }else if (constants==Constants.GERMAN){
            languageToLoad = "de";
        }else if (constants == Constants.JAPANESE){
            languageToLoad = "ja";
        }




        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getResources().updateConfiguration(config,
                context.getResources().getDisplayMetrics());

        toast.setText(context.getString(R.string.Hello));
        toast.show();



    }

    public void setLangRecreate(String langval) {
        Configuration config = context.getResources().getConfiguration();
        Locale locale = new Locale(langval);
        Locale.setDefault(locale);
        config.locale = locale;
        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());

    }









}
