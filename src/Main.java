import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username;
        int password,girdi,newpasword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz: ");
        username = inp.next();
        System.out.print("Sifrenizi giriniz: ");
        password = inp.nextInt();
        if(username.equals("java") && password == 1234){
            System.out.print("giriş yaptınız.");}
        else {
            System.out.println("yanlış giriş yaptınız. Sifreyi yenilemek ister misiniz?\n1.Evet\n2.Hayır");
            girdi = inp.nextInt();
            if(girdi == 2){
                System.out.print("Güle Güle...");}
            else{
                System.out.print("Yeni Şifernizi Giriniz: ");
                newpasword = inp.nextInt();
                if(newpasword == 1234){
                    System.out.print("Yeni şifreniz eskisi ile aynı olamaz!");}
                else{
                    System.out.print("Yeni şifreniz oluşturuldu.");

                }
            }

        }
    }
}