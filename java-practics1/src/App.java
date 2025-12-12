import java.util.HashMap;
import java.util.HashSet;

import javax.xml.stream.events.Characters;

public class App {
    String brand;
    int year;
    // App(String brand, int year){
    //         this.brand= brand;
    //         this.year= year;
    // }

    public void Car(){
        System.out.println(brand + "engine started");
        System.out.println(brand + "engine started1");
        System.out.println(brand + "engine started2");
        System.out.println(brand + "engine started4");
        System.out.println(brand + "engine started5");


    }
    public void Car1(){
        System.out.println(brand + "engine started");
        System.out.println(brand + "engine started1");
        System.out.println(brand + "engine started2");
        System.out.println(brand + "engine started4");
        System.out.println(brand + "engine started5");


    }

     public void Car2(){
        System.out.println(brand + "engine started");
        System.out.println(brand + "engine started1");
        System.out.println(brand + "engine started2");
        System.out.println(brand + "engine started4");
        System.out.println(brand + "engine started5");


    }


    public  int add(int a, int b){
        return a+b;
    }

    public  int[] reverseArray(int[] array){
        
        int i;
        for (i= array.length-1;i>=0; i--) {
            System.out.print(array[i] + " ");
        }   
          return array;
    }

    public void reverse(String str){
        String reversed = "";
        for (int i= str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
       
        System.out.println(reversed);
    }

    public void revStrArr(String[] array){
        
        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }
    }

    public boolean isPallindrome(String s){
        String n ="";
       for (int i = s.length()-1; i>=0;i--){
            n += s.charAt(i);
       }
       System.out.println(n + "-----"+ s);
       if(n.equals(s)){
        return true;
       }
       else return false;
    }

    public void countChar(){
        String s = "iiaagh";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Character key: map.keySet()){
            System.out.println(key + ":"+ map.get(key));
        }
    }

    public void removeDupChar(){
        String s= "mmat";
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }

    public void DuplicateWords(){
        String sentence = "I love and I love India";
        sentence.toLowerCase();

        String[] words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        for(String word: map.keySet()){
            if(map.get(word)>1){
                System.out.println(word +":"+ map.get(word));
            }
        }
    }

    public void dupInArr(){
        int [] arr= {1,2,3,4,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }

    public void dupCharArr(){
        char[] chars = {'a', 'b', 'c', 'c','b'};
        HashSet<Character> set = new HashSet<>();
        for(char c: chars){

            if(!set.add(c)){
                System.out.print(c);
            }
        }
    }
    
    public static void main (String[] args) {
        App app= new App();
        //App app1 = new App("honda", 2025);
        // int sum = app.add(2,4);
        // System.out.println(sum);

        // app.reverseArray(new int[]{1,2,3,4,5,6});
        // app.reverse("hello");
        // app.revStrArr(new String[]{"a","b","c","d"});
        // System.out.println(app.isPallindrome("abba"));
        //app.countChar();
        //app.removeDupChar();
        //app.DuplicateWords();
        //app1.Car();
        //app.dupInArr();
        app.dupCharArr();
        
         
        

        



    }
}
