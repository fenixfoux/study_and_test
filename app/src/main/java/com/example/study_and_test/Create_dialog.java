package com.example.study_and_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Create_dialog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);
        //start::замена дефолтного заголовка страницы на нужный
        TextView title_page = (TextView)findViewById(R.id.title_page);
        title_page.setText(R.string.np_title_dialog_window);
        //end::замена дефолтного заголовка страницы на нужный
        //start::замена стандартной кнокпи на кнопку для вызова диалогового окна
        Button call_dialog = (Button)findViewById(R.id.default_button);
        call_dialog.setText(R.string.call_dialog_window);
        //end::замена стандартной кнокпи на кнопку для вызова диалогового окна






        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent (Create_dialog.this, MainActivity.class);
                    startActivity(intent);
                    finish();//закрытие окна
                }catch (Exception e){}
            }
        });
    }




    private long backPressedTime; //vremea najatia knopki nazad
    private Toast backToast;
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Create_dialog.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception e){}
    }

}
