package com.church.churchapp.lenin.databasechurch;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "miembros")
public class members {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    String fecha ;
    @DatabaseField
    String nombre ;
    @DatabaseField
    String apellidos;
    @DatabaseField
    int edad ;
    @DatabaseField
    int tipomiembro; //Este campo es  1  = miembro,2 = reconciliar 3 = bautizado
    @DatabaseField
    String numerote;
    @DatabaseField
    int operadora ;//se refiere si es movistar o claro o cootel
    @DatabaseField
    String ecivil ;//Estado Civil 1:soltero, 2: casado, 3:divorciado
    @DatabaseField
    String direccion;
    @DatabaseField
    String diallamada;
    @DatabaseField
    String horario ;// AM:1, PM:2

    @DatabaseField
    String motivo; //motivo de oracion es una lista en la pantalla
    @DatabaseField
    String nombreseguidor;//persona que le da seguimiento
    //este campo sirve para saber si ya se subio
    // o no se ha subido a la base de datos FireBase
    @DatabaseField
    boolean uploadfirebase;
    public members(){

    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return apellidos;
    }

    public String getNumerote() {
        return numerote;
    }

    public int getEdad() {
        return edad;
    }

    public int getOperadora() {
        return operadora;
    }

    public String getEcivil() {
        return ecivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDiallamada() {
        return diallamada;
    }

    public String getHorario() {
        return horario;
    }


    public String getMotivo() {
        return motivo;
    }


    public int getTipomiembro(){
        return tipomiembro;
    }
    public String getNombreSeguidor(){
        return this.nombreseguidor;
    }
    public String getNombreseguidor(){
        return nombreseguidor;
    }
    public boolean getUploadFirebase(){
        return uploadfirebase;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setEdad(int edad){
        this.edad = edad ;
    }
    public void setEcivil(String ecivil){
        this.ecivil = ecivil;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setDiallamada(String diallamada){
        this.diallamada = diallamada;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public void setMotivo(String motivo){
        this.motivo = motivo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setNumerote(String numerote) {
        this.numerote = numerote;
    }
    public void setOperadora(int operadora){
        this.operadora = operadora;
    }
    public void setNombreseguidor(String nombreseguidor){
        this.nombreseguidor = nombreseguidor;
    }
    public void setTipomiembro(int tipomiembro){
        this.tipomiembro = tipomiembro;
    }
    public void setNombreSeguidor(String nombreseguidor){
        this.nombreseguidor = nombreseguidor;
    }
    public void setUploadfirebase(boolean uploadfirebase){
        this.uploadfirebase = uploadfirebase;
    }

}
