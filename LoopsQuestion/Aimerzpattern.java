class Aimerzpattern{
    public static void main(String []args){
        int n=5;
        System.out.println("AIMERZ PATTERN : ");
        //Pattern For A
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==2){
                    System.out.print(" * ");
                }
                else if(i==1 && (j==1 || j==3)){
                    System.out.print("* ");
                }
                else if((i==2||i==3||i==4) && (j==0||j==4)){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Pattern For I 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0||i==4)&&(j==0 ||j==1||j==2||j==3||j==4)){
                    System.out.print("*");
                }
                else if((i==1 ||i==2||i==3)&& j==2){
                    System.out.print("  *");
                }
                else{
                    System.out.print("");
                }    
            }
            System.out.println();
        }
        System.out.println();
        //Pattern For M
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 &&(j==0 ||j==4)){
                    System.out.print("*");
                }
                else if(i==1 &&(j==0||j==1 )){
                    System.out.print("*");
                }
                else if(i==1 && (j==3||j==4)){
                    System.out.print("*");
                }
                else if(i==2 &&(j==0 || j==2||j==4)){
                    System.out.print("*");
                }  
                else if((i==3 ||i==4)&&(j==0 || j==4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
        System.out.println();
        //Pattern For E
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 || i==4 || i==2)&&(j==0||j==1||j==2||j==3||j==4)){
                    System.out.print("*");
                }
                else if((i==1 ||i==3 ) &&j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // pattern for R 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 &&(j==0||j==1)){
                    System.out.print("*");
                }
                else if(i==1 && (j==0|| j==2)){
                    System.out.print("*");
                }
                else if(i==2 && (j==0||j==1||j==2)){
                    System.out.print("*");
                }
                else if(i==3 && (j==0||j==3)){
                    System.out.print("*");
                }
                else if(i==4&& (j==0 ||j==4)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //Pattern for Z 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 ||i==4)&&(j==0||j==1||j==2||j==3||j==4)){
                    System.out.print("*");
                }
                else if(i==1 && j==3){
                    System.out.print("*");
                }
                else if(i==2 && j==2){
                    System.out.print("*");
                }
                else if(i==3&& j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }

    }
}