package afd_ingrese;

public class AFD_ingrese {

    int cont; 
    boolean q_final; 
    static char [] cadena; 
    
    public static void main(String[] args) {
        AFD_ingrese aut = new AFD_ingrese(); 
        String expresion = "ababab"; 
        cadena = expresion.toCharArray(); 
        aut.inicio();
        if(aut.q_final){
            System.out.println("CADENA ACPTADA");    
        }else{
            System.out.println("CADENA NO ACEPTADA");
        }
    }
    public void inicio(){
        cont = 0; 
        q_final = false; 
        q0(); 
    }
    public void q0(){
        System.out.print("ENTRO AL ESTADO q0\n");
        q_final = false; 
        if (cont < cadena.length){
            if(cadena[cont] == 'a'){
                cont ++; 
                q0(); 
            } 
            else if(cadena[cont] =='b'){
                cont ++; 
                q1();    
            }
        }
    }
    public void q1(){
        System.out.print("ENTRO AL ESTADO q1\n");
        q_final = false; 
        if (cont < cadena.length){
            if(cadena[cont] == 'a'){
                cont ++; 
                q1(); 
            } 
            else if(cadena[cont] =='b'){
                cont ++; 
                q2();    
            }
        }
    }
    public void q2(){
        System.out.print("ENTRO AL ESTADO q2\n");
        q_final = false; 
        if (cont < cadena.length){
            if(cadena[cont] == 'a'){
                cont ++; 
                q2(); 
            } 
            else if(cadena[cont] =='b'){
                cont ++; 
                q3();    
            }
        }
    }
    public void q3(){
        System.out.print("ENTRO AL ESTADO q3\n");
        q_final = true; 
        if (cont < cadena.length){
            if(cadena[cont] == 'a'){
                cont ++; 
                q3(); 
            } 
            else if(cadena[cont] =='b'){
                cont ++; 
                q4();    
            }
        }
    }
    public void q4(){
        System.out.println("ENTRO AL ESTADO q4\n");
        q_final = false; 
    }
}
