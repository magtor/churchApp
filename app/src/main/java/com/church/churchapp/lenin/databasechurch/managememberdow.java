package com.church.churchapp.lenin.databasechurch;
import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

public class managememberdow {

    private DataBaseHelper databaseHelper = null;
    private Context context;
    public void managememberdow(){

    }
    //con este constructor guardamos el registro que se descarga de FireBase
    public void managememberdow(Context ctx,String keynode,String fecha,String nombre,String apellidos,int edad
            ,int tipomiembro,String numerotelefono,int operadora,String ecivil
            ,String direccion,String diallamada,String horario,String motivo,String seguidor,boolean trasladado){

        this.context = ctx;
        createMember(keynode,fecha,nombre,apellidos,edad,tipomiembro,numerotelefono,operadora
                ,ecivil,direccion,diallamada,horario,motivo,seguidor,trasladado);
    }
    //guardamos en la base de datos local el registro que se descarga desde firebase
    private void createMember(String keynode,String fecha,String nombre,String apellidos,int edad,
                              int tipomiembro,String telefono,int operadora,String ecivil,
                              String direccion,String diallamada,String horario,String motivo,
                              String seguidor,boolean traslado){
        final memberdownload miembros  = new memberdownload();
        miembros.setKeynode(keynode);
        miembros.setFecha(fecha);
        miembros.setNombre(nombre);
        miembros.setApellidos(apellidos);
        miembros.setEdad(edad);
        miembros.setTipomiembro(tipomiembro);
        miembros.setNumerote(telefono);
        miembros.setOperadora(operadora);
        miembros.setEcivil(ecivil);
        miembros.setDireccion(direccion);
        miembros.setDiallamada(diallamada);
        miembros.setHorario(horario);
        miembros.setMotivo(motivo);
        miembros.setNombreseguidor(seguidor);
        miembros.setTrasladoserverlocal(traslado);
        try {
            // This is how, a reference of DAO object can be done
            final Dao<memberdownload, Long> recordMember = getHelper().getDaoMemberDownload();
            //This is the way to insert data into a database table
            recordMember.create(miembros);

        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }



    }
    private DataBaseHelper getHelper() {
        if (databaseHelper == null) {
            databaseHelper = OpenHelperManager.getHelper(this.context, DataBaseHelper.class);
        }
        return databaseHelper;
    }

}
