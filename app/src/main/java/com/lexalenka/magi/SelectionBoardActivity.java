package com.lexalenka.magi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by v622721 on 10/23/16.
 */
public class SelectionBoardActivity extends Activity implements OnClickListener {

    TextView selectText;
    ImageButton Card1;
    ImageButton Card2;
    ImageButton Card3;
    ImageButton Card4;
    ImageButton Card5;
    ImageButton Card6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardselect);

        selectText = (TextView)findViewById(R.id.selectText);
        selectText.setText("Pick 1 Wand");

        Card1 = (ImageButton)findViewById(R.id.imageButton);
        Card1.setOnClickListener(SelectionBoardActivity.this);
        Card1.setTag(0);

        Card2 = (ImageButton)findViewById(R.id.imageButton2);
        Card2.setOnClickListener(SelectionBoardActivity.this);
        Card2.setTag(0);

        Card3 = (ImageButton)findViewById(R.id.imageButton3);
        Card3.setOnClickListener(SelectionBoardActivity.this);
        Card3.setTag(0);

        Card4 = (ImageButton)findViewById(R.id.imageButton4);
        Card4.setOnClickListener(SelectionBoardActivity.this);

        Card5 = (ImageButton)findViewById(R.id.imageButton5);
        Card5.setOnClickListener(SelectionBoardActivity.this);

        Card6 = (ImageButton)findViewById(R.id.imageButton6);
        Card6.setOnClickListener(SelectionBoardActivity.this);


        //will refactor later
    }


    @Override
    public void onClick(View view) {
        int status = (int) view.getTag();

        switch (view.getId()) {

            case R.id.imageButton:
            case R.id.imageButton2:
            case R.id.imageButton3:
                if(status == 0);
                setVisible();
                setTag1();
                selectText.setText("Pick 1st Spell");
                if(status == 1){
                    startActivity(new Intent(SelectionBoardActivity.this, PlayBoardActivity.class));
                }
                break;



            case R.id.imageButton4:
            case R.id.imageButton5:
            case R.id.imageButton6:

                startActivity(new Intent(SelectionBoardActivity.this, PlayBoardActivity.class));
                  break;
        }
    }



    public void setVisible(){
        Card4.setVisibility(ImageButton.VISIBLE);
        Card5.setVisibility(ImageButton.VISIBLE);
        Card6.setVisibility(ImageButton.VISIBLE);
    }

    public void setTag1(){
        Card1.setTag(1);
        Card2.setTag(1);
        Card3.setTag(1);
    }
}

