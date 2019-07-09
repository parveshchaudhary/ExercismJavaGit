import java.util.Arrays;
import java.util.*;

class DnDCharacter {

    int  ability,constitutionmodifier, strength, dexterity, constitution, intelligence, wisdom, charisma, hitpoints;

    int roll(){
        // int[] rollArr = new int[4];
        // for(int i=0 ; i<3 ; i++){
        //     rollArr[i] = (int )(Math.random() * 6 + 1);
        // } 
        // Arrays.sort(rollArr);
        // return rollArr[3]+rollArr[2]+rollArr[1];

        int a,b,c,d,sum=0;

        a=(int)(Math.random() * 6 + 1);
        b=(int)(Math.random() * 6 + 1);
        c=(int)(Math.random() * 6 + 1);
        d=(int)(Math.random() * 6 + 1);

        if(a>b){
            sum += a;
            if(c>d){
                sum += c;
                if(d>b){
                    sum += d;
                } else{
                    sum += b;
                }
            } else{
               sum += d; 
               if(b>c){
                    sum += b;
               } else{
                    sum += c;
               }
            }
        } else{
            sum += b;
            if(c>d){
                sum += c;
                if(d>a){
                    sum += d;
                } else{
                    sum += a;
                }
            } else{
               sum += d; 
               if(a>c){
                    sum += a;
               } else{
                    sum += c;
               }
            }
        }
        return sum; 
    }

    DnDCharacter(){
        this.ability = roll();

        this.strength = roll();
        this.dexterity = roll();
        this.constitution = roll(); 
        this.intelligence = roll();
        this.wisdom = roll();
        this.charisma = roll();
        
        this.constitutionmodifier = (int) Math.floor((constitution-10)/2.0);
        this.hitpoints = 10 + constitutionmodifier;
    }

    int ability() {
        return ability;
    }

    int modifier(int input) {
        
        switch(input){
            case 3: return -4;
            case 4: return -3;
            case 5: return -3;
            case 6: return -2;
            case 7: return -2;
            case 8: return -1;
            case 9: return -1;
            case 10: return 0;
            case 11: return 0;
            case 12: return 1;
            case 13: return 1;
            case 14: return 2;
            case 15: return 2;
            case 16: return 3;
            case 17: return 3;
            case 18: return 4;
            default: return 0;
        }
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }

}
