package com.mehul.frenchphrases;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //method created to run when a button with the OnClick named to translate is clicked.
    public void translate (View v){
        //create variable to equal the id of the button was clicked or used to trigger the method.
        //It will be a numeric identifier, not the name entered for the ID
        int idNum = v.getId();

        //create string variable to hold the id string or name of the item that was tapped
        //every time it gets tapped
        String thisId = v.getResources().getResourceEntryName(idNum);

        //Check to see the correct output
        System.out.println("Numeric value of id: " + idNum + "\n String value of the ID: " + thisId);

        //create int variable to hold the id of the audio file
        //only works if the file name is the same name as the button ID. in this instance since
        //thisID is the ID name of the button and happens to be the same as the file name
        int resId = getResources().getIdentifier(thisId, "raw", "com.mehul.frenchphrases");

        //create the mediaplayer object to hold the audio file while clicked
        MediaPlayer mPlayer = MediaPlayer.create(this, resId);

        //starts playing the audio file when the button is clicked
        mPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
