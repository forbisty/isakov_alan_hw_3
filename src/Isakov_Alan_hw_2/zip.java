package Isakov_Alan_hw_2;

public class zip {

        public static void main (String[] args) {
            System.out.println(permission(generateRandomAge(), 15));
            System.out.println(permission(generateRandomAge(), -20));
            System.out.println(permission(generateRandomAge(), 30));
            System.out.println(permission(generateRandomAge(), -1));
            System.out.println(permission(generateRandomAge(), 0));
        }

        public static int generateRandomAge(){
            return (int) (Math.random() * 100) + 1;
        }
        public static String permission (int age, int temperature){
            if (age >= 20 && age < 45){
                if (temperature > -20 && temperature < 30){
                    return "Можно идти гулять";
                }
            }else if (age < 20){
                if (temperature > 0 && temperature < 28){
                    return "Можно идти гулять";
                }
            }else if (age > 45){
                if (temperature > -10 && temperature < 25) {
                    return "Можно идти гулять";
                }
            }
            return "Оставайтесь дома";
        }
    }