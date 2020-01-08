
package stringurile;

public class MyString3 {
    
    public static void main (String[]args){
        
        String str = "I-am-the-one";
        String [] wordArray = str.split("-"); //separarea stringurilor cu ajutorul SIRURILOR
        
        for (int i=0; i<wordArray.length;i++){  //accesarea sirurilor 
        
        System.out.println(wordArray[i]);
        
        }
        String str1 ="Is this winter?   Yes it is!  But why? Because.";
        String [] cvArray = str1.split("[ .,?!]+");//separa stringul acolo unde intalneste [...] "+"= de fiecare data
        
        for (int j=0;j<cvArray.length;j++){
            
            System.out.println(cvArray[j]);
        
        /*String []forbiden = {"<",">","'"};
        String input = "<div>my'div'tag</div>";
        
        String output = input;
        for (int i=0; i<forbiden.length;i++){
        
        output = output.replace(forbiden[i],"");
        
        }
        System.out.println(output);*/
            
        }
        
        
    
    
    
    }
    
    
    
    
    
}
