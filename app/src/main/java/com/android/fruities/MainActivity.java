package com.android.fruities;

import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner mSpinner;
    private TextView nameTxt;
    private ImageView fruitImage;
    private TextView infoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpinner=findViewById(R.id.letter_spinner);
        nameTxt=findViewById(R.id.name);
        fruitImage=findViewById(R.id.fruit_image);
        infoTxt=findViewById(R.id.info);

        mSpinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Fruit fruit=Fruit.getFruit(position);
        fruitImage.setImageResource(fruit.getImage());
       // nameTxt.setText(fruit.getName(), TextView.BufferType.SPANNABLE);
       // Spannable s=(Spannable)nameTxt.getText();
        //int color= ContextCompat.getColor(this,fruit.getLetterColor());
        SpannableString sp=new SpannableString(getResources().getString(fruit.getName()));
        int color=ResourcesCompat.getColor(getResources(), fruit.getLetterColor(), null);
        sp.setSpan(new ForegroundColorSpan(color),0,1,0);
        nameTxt.setText(sp);
        infoTxt.setText(fruit.getInfo());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
