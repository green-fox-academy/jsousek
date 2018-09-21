import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
        System.out.println("put the number of sausages in da club:");
        Scanner sausageCount = new Scanner(System.in);
        int sausage = sausageCount.nextInt();

        System.out.println("put the number of lassies in da club:");
        Scanner galCount =new Scanner(System.in);
        int gals = galCount.nextInt();

        if (gals == 0) {
            System.out.println("Sausage party, lets go to Termix fellow tomboys");
        }
        else if (gals+sausage >= 20 && gals == sausage) {
            System.out.println("Excelent party");
        }
            else if (gals+sausage >= 20 && gals != sausage) {
            System.out.println("Gals party, ofc ;)");
        }

                else if (gals + sausage < 20 ){
                    System.out.println("Introverts WhatsUp party, yeah!");
            }
        }

    }

