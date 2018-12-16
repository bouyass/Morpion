/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.Model;

/**
 *
 * @author lyes
 */
public class Model {
    
     public int indice = 0;
    
    public boolean test(int i , int j, boolean red){
    
        int[] rougeI = new int[5];
        int[] rougeJ = new int[5];
        int[] vertI = new int[5];
        int[] vertJ = new int[5];
        int cptRI=0,cptRJ=0,cptVI=0,cptVJ=0;
       
        
        if (red == true){
           rougeI[cptRI] = i;
           rougeJ[cptRJ] = j;
           cptRI++;cptRJ++;
           if(this.checkSequece(rougeI,0)){
               System.out.println("le joueur rouge a gagné");
               return true;
           }
             if(this.checkSequece(rougeJ,0)){
               System.out.println("le joueur rouge a gagné");
               return true;
           }
        }else{
            vertI[cptVI]=i;
            vertJ[cptVJ]=j;
            cptVI++;cptVJ++;
             if(this.checkSequece(vertI,0)){
               System.out.println("le joueur vert a gagné");
               return true;
           }
             if(this.checkSequece(vertJ,0)){
               System.out.println("le joueur vert a gagné");
               return true;
           }
        }
        return true;
        
    }
    
   public boolean checkSequece(int[] tab,int seq){
      
       seq = tab[indice];
       int res =0;
       int cpt = 1;
       
       if(res == 3){
           return true;
       }
       
       for (int i = 0 ;i<tab.length;i++){
           if (tab[i] != seq ){
               if (tab[i]+cpt == seq){
                  res++;
                  cpt++;
                   System.out.println("lol1");
               }
               if (tab[i]-cpt == seq){
                   cpt++;
                   res++;
                    System.out.println("lol");
               }
           }
       }
       
       if (indice < tab.length-1){
           indice++;
           checkSequece(tab,indice);
       }
       
        return false;
    }
}
