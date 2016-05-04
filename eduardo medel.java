import java.util.Stack;


public class Respuestas {
    
    public void metodo1() {
        
        Stack juegos=new Stack();
        
        juegos.push("football");
        juegos.push("tennis");
        juegos.push("resident evil");
        juegos.push("gta");
        juegos.push("mortal kombat");
        juegos.push("street fighter");
        
        System.out.println("tamaño pila: " + juegos.size());
        System.out.println("ultimo valor pila: " + juegos.peek());
        System.out.println("buscar posision de tennis : " + juegos.search("tennis"));
        System.out.println("quitar el ultimo elemento de la pila: " + juegos.pop());
        System.out.println("ver si la pila tiene datos: " + juegos.empty());
    }
    
    public void metodo2()
    {
        Stack notas=new Stack();
        
        notas.push(5);
        notas.push(7);
        notas.push(3);
        notas.push(2);
        notas.push(4);
        
        for(int i=0; i < notas.size(); i++)
        {
            System.out.println(notas.get(i));
        }
    }
    
    public void metodo3() {
        
        Stack notas=new Stack();
        
        notas.push(5);
        notas.push(7);
        notas.push(3);
        notas.push(2);
        notas.push(4);
        
        
        
        
        for(Object n : notas) 
        {
            System.out.println(n);
        }
    }
    
    
    public void metodo4() {
        
        Stack libros=new Stack();
        
        libros.push("harry potter");
        libros.push("narnia");
        libros.push("señor anillos");
        libros.push("mortal kombat");
        libros.push("momia");
        
        int num=0;
        int siclo = libros.size();
        while(num < siclo)
        {
           System.out.println("libros eliminados:" + libros.pop());
           num++; 
        }
    }
    
    public void metodo5() {
        
        Stack libros=new Stack();
        
        libros.push("harry potter");
        libros.push("narnia");
        libros.push("señor anillos");
        libros.push("mortal kombat");
        libros.push("momia");
        
        int num=0;
        int siclo = libros.size();
        while(num < siclo)
        {
           System.out.println("libros eliminados:" + libros.pop());
           num++; 
        }
    }
    
}