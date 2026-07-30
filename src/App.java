import java.util.Arrays; //Permitirá importar la librería, que nos ordenará la Array de menor a mayor.
import javax.swing.JOptionPane;
public class App {
    
   
    public static void main(String[] args) throws Exception {
        
        int[]vector={45,50,30,80,20,90,15,70,55,60,100,56,89,48,73};
        Arrays.sort(vector); //Esto no ordenará el array

int dato;
    dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero que desea buscar"));
int posicion = binaria(vector,dato);

if (posicion !=-1){
 JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posición: "+posicion);
}else{
    JOptionPane.showMessageDialog(null, "El numero no ha sido encontrado");
}
    }


 public static int binaria (int[]vector , int dato){
     int i = 0;
     int f = vector.length -1;

     while (i<=f){

        int medio = (i+f)/2;
     
        if(vector[medio]==dato){
        return medio;
        }

    if (dato < vector[medio]) {
       f = medio -1;
    }
    else {
        i = medio +1;
    }
}
return -1;

  }

}
