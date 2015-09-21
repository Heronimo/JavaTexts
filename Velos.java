import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();
        int montant  = 0; 
    	int montantt1= 0;
    	int montantt2= 0;
        if (debut > 24 ){
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");        	
        }else if (debut == fin ){
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }else if (debut > fin){
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }else { 
        	int heures = fin - debut;
        	System.out.println("Vous avez loué votre vélo pendant " + heures + " heures"); 	
        	
        	
        	
        	if (debut>17){
        		montantt1 =+ (fin- debut);
        		montant= montantt1;
        	} 
        	if (debut>7 && debut < 17) {
        		if (fin <= 17){
        		montantt2 =+ (fin- debut)*2; 
        		montant= montantt2;
        	}

        	if (fin > 17){
        		montantt2 =+ (17-debut)*2; 
        		montantt1 =+ (fin-17)*2; 
        		montant= montantt1+montantt2;
        	}else if (debut < 7){
        		if (fin < 7){
        			montantt1= fin- debut;
        		}else if ((fin > 7) && (fin < 17)){
        			montantt1 = 7 - debut;
        			montantt2 = 17 - (fin - 7);
        		    montant= montantt1+montantt2;
        		}else if (fin > 17){
        			montantt1 = 7 - debut;
        			montantt1 =+ fin - 17;
        			montantt2 = 10*2;
        			montant= montantt1 + montantt2;		
        		}

        	}
        		
        	}
        	
        clavier.close();
    }
}
