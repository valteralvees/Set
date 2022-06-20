package set;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        // TODO code application logic here
        //CONJUNTO HETEROGÊNEO
        
        //#1----------------------------------------------------------
        HashSet conjunto = new HashSet();
        
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        
        System.out.println("Tamanho é "+ conjunto.size());
        
        conjunto.add("Teste");
        conjunto.add('x');
        
        System.out.println("Tamanho é "+ conjunto.size());
        
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        
        System.out.println("Tamanho é "+ conjunto.size());
        
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));
        
        
        //#2----------------------------------------------------------
        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(conjunto);
        
        conjunto.addAll(nums); //União entre conjuntos
        System.out.println(conjunto);
        
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        
        conjunto.clear();
        System.out.println(conjunto);
        
        
        //CONJUNTO HOMOGÊNEO
        
        
        
    }
    
}
