package com.example.frehgestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    boolean isEmpty(EditText text){CharSequence str=text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    EditText logp2, passp2;
    TextView oubp2, errp2;
    Button conp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

      //  public void setupUI(){
            logp2=findViewById(R.id.log);
            passp2=findViewById(R.id.pass);
            oubp2=findViewById(R.id.oublie);
            errp2=findViewById(R.id.errcon);
            conp2=findViewById(R.id.but_con2);
      //  }

       // public void setupListeners(){}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        oubp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(),Pageverif.class);
                startActivity(ob);
            }
        });

        conp2.setOnClickListener(new View.OnClickListener() {
           void CheckUsername (){
                 boolean isValid=true;
                    if(isEmpty(conp2)){
                        conp2.setError("ENTER OBLIGATOIREMENT UN LOGIN VALIDE");
                        isValid=false;
                    }else{
                        if(isEmpty(passp2)){
                            passp2.setError("ENTER OBLIGATOIREMENT UN MOT DE PASSE");
                            isValid=false;
                        }
                    }
                    if (isValid){
                        String usernameValue = conp2.getText().toString();
                        String passwdValue = passp2.getText().toString();
                        if(usernameValue.equals("Franklin") && passwdValue.equals("123456")) {
                            Intent ob = new Intent(getApplicationContext(),Menu.class);
                            startActivity(ob);
                            this.finish();
                        }else{
                            Toast t =Toast.makeText(getApplicationContext(), "Mauvais mot de passe ou login", Toast.LENGTH_SHORT);
                            t.show();
                        }
                        }
                    }

            });

           /* @Override
            public void onClick(View view) {

                ChekDataEntered{

                    if(isEmpty(logp2) ){
                        Toast t= Toast.makeText(this, "Veuillez entrer un login ...", Toast.LENGTH.SHORT);
                        t.show();
                    }
                };
                Intent ob = new Intent(getApplicationContext(),Menu.class);
                startActivity(ob);
            }
            /*/
        });
    }
}