package afd_2.pkg1;

public class AFD_21 {
    char[] alfabeto = {'0','1'}; 
    public static String[] estado_inicial = {"q0"}; 
    public static String[] estado_final = {"q2"}; 
    public static String[] estados_q = {"q0","q1","q2"}; 
    public static String[][] transiciones = {{"1","0"},{"1","2"},{"1","2"}};
                    
    static private void pertenece(String entrada){
        
        entrada.toCharArray(); 
        char[]guardar = entrada.toCharArray();
        String q_actual ="0";
        int aux;
        for(int fila=0;fila<guardar.length;fila++){
         
             if(guardar[fila]==0){ 
                 aux=0;
             }
             else{
                 aux=1;
             }
             
      q_actual = transiciones[Integer.parseInt(q_actual)][aux];
     }
        if(q_actual=="2");{
     System.out.println("CADENA ACEPTADA");  
    }
        else{
        System.out.println("CADENA INCORRECTA"); 
          }
    }
    
    public static void main(String[] args) {
        pertenece ("0101");
    }
    
}
