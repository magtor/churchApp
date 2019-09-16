package com.church.churchapp.lenin.uichurch.searchmember;

public class resultMiembros {


    private String keynode;//el id del registro del miembro en firebase database
    String fecha ;
    String nombres ;
    String apellidos;
    int edad ;
    int tipomiembro; //Este campo es  1  = miembro,2 = reconciliar 3 = bautizado
    String telefono;
    int operadora ;//se refiere si es movistar o claro o cootel
    String ecivil ;//Estado Civil 1:soltero, 2: casado, 3:divorciado
    String direccion;
    String diallamada;
    String horario ;// AM:1, PM:2
    String motivo; //motivo de oracion es una lista en la pantalla
    String nombreseguidor;//persona que le da seguimiento, revisa la ficha
    public void resultMiembros(){

    }
    public void resultMiembros(String keynode,String fecha,String nombres,
                               String apellidos,int edad,int tipomiembro,String telefono,int operadora,String ecivil,
                               String direccion,String diallamada,String horario,String motivo,String nombreseguidor){
        this.keynode = keynode;
        this.fecha = fecha;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.tipomiembro = tipomiembro;
        this.telefono = telefono;
        this.operadora = operadora;
        this.ecivil = ecivil;
        this.direccion = direccion;
        this.diallamada = diallamada;
        this.horario = horario;
        this.motivo = motivo;
        this.nombreseguidor = nombreseguidor;
    }

    public String getKeynode() {
        return keynode;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }


    public String getTelefono() {
        return telefono;
    }

    public int getTipomiembro() {
        return tipomiembro;
    }

    public int getEdad() {
        return edad;
    }

    public int getOperadora() {
        return operadora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDiallamada() {
        return diallamada;
    }

    public String getEcivil() {
        return ecivil;
    }

    public String getHorario() {
        return horario;
    }

    public String getNombreseguidor() {
        return nombreseguidor;
    }


}
