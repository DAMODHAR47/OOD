public class Message {
    private String algorithmName;
    private String text;
    public Message(String algorithmName){
       this.algorithmName=algorithmName;
   }
   public string getText(){
        return decrypt(text);
   }
   public void setText(String text){
         this.text = encrypt(text);
   }
   private string encrypt(String data){
        if (algorithmName.equals("Aes")){
            System.out.println("Encrypting data using AES algorithm");
            /*Code to encrypt data using AES algorithm*/
        }
       else if (algorithmName.equals("Blowfish")){
            System.out.println("Encrypting data using Blowfish algorithm");
            /*Code to encrypt data using Blowfish algorithm */
        }
        /*More else if statements for other encryption algorithms*/
   }
    private String decrypt(String data){
        if (algorithmName.equals("Aes")){
            System.out.println("Decrypting cipher using AES algorithm");
            /*Code to decrypt data using AES algorithm*/
        }
       else if (algorithmName.equals("Blowfish")){
            System.out.println("Decrypting cipher using Blowfish algorithm");
            /*Code to decrypt data using Blowfish algorithm */
        }
        /*More else if statements for other encryption algorithms*/
    }     
}


SRP -- managing message data, encryption/decreption 
OCP
DIP -- The class depends on concrete logic (algorithm names, encryption details). No abstraction or interface for encryption algorithms to invert dependency.
Magic strings
Type Checking -- 	The code uses multiple if-else on algorithm name strings to switch behavior — a classic type checking anti-pattern, better replaced with polymorphism or strategy pattern.
Tight Coupling -- The Message class is tightly coupled to specific encryption algorithms by name and implementation details.
DRY --mirrored conditional branches that repeat similar logic structure. Better to encapsulate to avoid duplication.
Testability --Encrypt/decrypt code is buried inside this class, making it harder to test algorithms separately or mock them in unit tests.
