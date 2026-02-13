public class Hello {
// The .class file created is the Byte Code 
    public static void main(String[] args) {
        System.out.print("Hello World\n");

        for(int i=0; i<4; i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println();

        for(int i=0;i<4;i++){
            for(int j=1;j<4-i;j++){
                System.out.print('.');
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print('*');

            }
            for(int j=1;j<4-i;j++){
                System.out.print('.');
            }
            System.out.println();
        }
    }
}
