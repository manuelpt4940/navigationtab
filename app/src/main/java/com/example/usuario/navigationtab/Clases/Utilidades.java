package com.example.usuario.navigationtab.Clases;

public class Utilidades {
    public static boolean PestanaAlcanceFuncional=false;
    public static boolean PestanaEquilibrio=false;

    public static boolean HabilitacionAC=false;
    public static boolean HabilitacionEQ=false;

    public static boolean AF_Avanzar_FirstFragment=false;
    public static boolean AF_Avanzar_SecondFragment=false;
    public static boolean AF_Avanzar_ThirdFragment=false;

    public static boolean EQ_Avanzar_FirstFragment=false;

    public void actualizar(){
        PestanaAlcanceFuncional=false;
        PestanaEquilibrio=false;
        HabilitacionEQ=false;
        HabilitacionAC=false;
        AF_Avanzar_FirstFragment=false;
        AF_Avanzar_SecondFragment=false;
        AF_Avanzar_ThirdFragment=false;
        EQ_Avanzar_FirstFragment=false;
    }
}
