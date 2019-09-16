package com.church.churchapp.lenin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.church.churchapp.lenin.databasechurch.managememberdow;
import com.church.churchapp.lenin.databasechurch.members;
import com.church.churchapp.lenin.uichurch.searchmember.resultMiembros;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbarmain;
    FirebaseAuth mAuth;
    DatabaseReference mFirebaseDatabase;
    List<members> memberlist;
    //se usara para guardar los registro de
    //los miembros de la iglesia  tanto en la subida a firebase,
    // como en la bajada de esos datos
    resultMiembros memberfirebase ;
    List<resultMiembros> resultMiembroslist ;
    int idmember = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbarmain = (Toolbar) findViewById(R.id.toolbar);
        toolbarmain.setTitle("Church Member");
        setSupportActionBar(toolbarmain);
        mAuth = FirebaseAuth.getInstance();

        }

    //sirve para que bajemos los datos que se grabaron
    // en el proceso de digitacion y que se subieron a Firebase RealTime Database
    private void downloadCloudFireBase(){
        final FirebaseUser user = mAuth.getCurrentUser();

        // memberfirebase = new resultMiembros();
        if ((user != null)){
            mFirebaseDatabase=     FirebaseDatabase.getInstance().getReference("members");
            mFirebaseDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    List<String>  keys = new ArrayList<>();
                    managememberdow manamemberdow = new managememberdow();
                    resultMiembroslist.clear();
                    for(DataSnapshot keynode : dataSnapshot.getChildren()){
                        keys.add(keynode.getKey());
                        // String nombres = keynode.child("nombres").toString();
                        resultMiembros  memberfirebasedown = keynode.getValue(resultMiembros.class);
                        resultMiembroslist.add(memberfirebasedown);
                    }
                    for(resultMiembros memberdow: resultMiembroslist) {
                        manamemberdow.managememberdow(getApplicationContext(),
                                memberdow.getKeynode(),memberdow.getFecha(),
                                memberdow.getNombres(),memberdow.getApellidos(),
                                memberdow.getEdad(),memberdow.getTipomiembro(),
                                memberdow.getTelefono(),memberdow.getOperadora(),
                                memberdow.getEcivil(),memberdow.getDireccion(),
                                memberdow.getDiallamada(),memberdow.getHorario(),
                                memberdow.getMotivo(),memberdow.getNombreseguidor(),true);
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menutoolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
