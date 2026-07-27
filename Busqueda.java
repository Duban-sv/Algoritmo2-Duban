
import javax.swing.JOptionPane;

public class Busqueda {
    
    public static void main(String[] args) throws Exception {
       
        int[]v={45,50,30,65,80,20,90,15,70,55};
int dato;
    dato=   Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor a buscar"));
int posicion = secuencial(v, dato);
if (posicion !=-1){
    JOptionPane.showInternalMessageDialog ( null, "El valor a sido encontrado en la posición:" + posicion);
}
else{
    JOptionPane.showMessageDialog(null, "El dato no ha sido encontrado");
}


}
   public static int secuencial (int[]v, int dato){
        for (int i = 0; i< v.length; i++){
            if (v[i]==dato){
                return i; //Encontró el dato, muestre la posición i 
            }
        }
    return -1; //No encontró la posición i
     }

}