public class Vehiculo{
    public static Vehiculo vehiculos[]=new Vehiculo[10];
    public static int tamano=10;
    public static int posAnadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public Vehiculo(){
    }
    public Vehiculo(int mo,String ma,double va){
        this(mo,ma,va,"verde");
    }
    public Vehiculo(int mo,String ma,double va,String co){
        Vehiculo vAsignar=new Vehiculo();
        vAsignar.setModelo(mo);
        vAsignar.setMarca(ma);
        vAsignar.setValorComercial(va);
        vAsignar.setColor(co);
        this.vehiculos[posAnadir]=vAsignar;
        this.posAnadir=this.posAnadir+1;
    }
    public static int getPosAnadir(){
        return posAnadir;
    }
    public void setModelo(int mo){
        this.modelo=mo;
    }
    public void setMarca(String ma){
        this.marca=ma;
    }
    public void setValorComercial(double va){
        this.valorComercial=va;
    }
    public void setColor(String co){
        this.color=co;
    }
    public int getModelo(){
        return this.modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public double getValorComercial(){
        return this.valorComercial;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        String toString=getModelo()+", "+getMarca()+", "+getValorComercial()+", "+getColor();
        return toString;
    }
    public static String toStringVehiculos(){
        String listaVehiculo="";
        for(int i=0;i<posAnadir;i++){
            int mo=vehiculos[i].getModelo();
            String ma=vehiculos[i].getMarca();
            double va=vehiculos[i].getValorComercial();
            String co=vehiculos[i].getColor();
            listaVehiculo=listaVehiculo+"/ "+mo+", "+ma+", "+va+", "+co;
        }
        return listaVehiculo;
    }
    public static int cantidadVehiculos(){
        return posAnadir;
    }
    public static String verdes(Vehiculo[] n){
        String lista="";
        for(int i=0;i<posAnadir;i++){
            n[i].getColor();
            if(n[i].getColor().equals("verde")){
                lista=lista+n[i].toString();
            }
        }
        return lista;
    }
}