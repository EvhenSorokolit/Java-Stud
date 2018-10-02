
package basepackage;
import  java.util.Scanner;

public class chartostar {




    public static void main(String[] args) {
        int i;
        String pos1 = "";
        String pos2 = "";
        String pos3 = "";
        String pos4 = "";
        String pos5 = "";
        /*                   0      1       2       3     4     5       6      7      8       9    10      11    12     13     14     15      16       17     18     19        20      21   22        23       24     25      26      27       28    29       30     31*/
        String[] starts ={"****","*** ","* * *","** *","* **","**  ","* * ","*  *","  * ","*   "," ** "," * *","   *","   ","  **","*   *","** **","*****","  *  "," * * "," *   ","*    "," *** ","    *","**   "," ****"," *  *","* ** ","**  *","  ***","*** *","*  **",};
        System.out.println("Введите ФИО в формате:Ф пробел И пробел О(учёт ведётя по  первым ПЯТИ символам), регистр не имеет значения");
        Scanner in = new Scanner(System.in,"cp866");
        String intxt = in.nextLine().toLowerCase();


        if (intxt.length()<5 ){
            System.out.println(" Не правильный формат ввода: не достаточное количесво введённых символов. Пример:С Е М");
        }
        else if (intxt.charAt(1)!= ' ' | intxt.charAt(3)!= ' '| intxt.charAt(0)== ' ' | intxt.charAt(2)== ' '| intxt.charAt(4)== ' ' ) {
                     System.out.println(" Не правильный формат ввода: Не выставлены пробелы  между буквами, или они выставлене вместо букв. Пример:С Е М ");
        }
        else{

            for (i=0;i<(intxt.length());i++){


                    switch (intxt.charAt(i)){
                        case 'а':
                            pos1 += starts[18] + " ";
                            pos2 += starts[19] + " ";
                            pos3 += starts[17] + " ";
                            pos4 += starts[15] + " ";
                            pos5 += starts[15] + " ";
                            break;
                        case 'б':
                            pos1 += starts[0] + " ";
                            pos2 += starts[9] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'в':
                            pos1 += starts[0] + " ";
                            pos2 += starts[7] + " ";
                            pos3 += starts[1] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'г':
                            pos1 += starts[0] + " ";
                            pos2 += starts[9] + " ";
                            pos3 += starts[9] + " ";
                            pos4 += starts[9] + " ";
                            pos5 += starts[9] + " ";
                            break;
                        case 'д':
                            pos1 += starts[22] + " ";
                            pos2 += starts[19] + " ";
                            pos3 += starts[17] + " ";
                            pos4 += starts[15] + " ";
                            pos5 += starts[15] + " ";
                            break;
                        case 'е':
                            pos1 += starts[0] + " ";
                            pos2 += starts[9] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[9] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'ё':
                            pos1 += starts[10] + " ";
                            pos2 += starts[0] + " ";
                            pos3 += starts[5] + " ";
                            pos4 += starts[5] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'ж':
                            pos1 += starts[2] + " ";
                            pos2 += starts[10] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[10] + " ";
                            pos5 += starts[2] + " ";
                            break;
                        case 'з':
                            pos1 += starts[0] + " ";
                            pos2 += starts[12] + " ";
                            pos3 += starts[1] + " ";
                            pos4 += starts[12] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'и':
                            pos1 += starts[7] + " ";
                            pos2 += starts[4] + " ";
                            pos3 += starts[3] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[7] + " ";
                            break;
                        case 'й':
                            pos1 += starts[10] + " ";
                            pos2 += starts[13] + " ";
                            pos3 += starts[4] + " ";
                            pos4 += starts[3] + " ";
                            pos5 += starts[7] + " ";
                            break;
                        case 'к':
                            pos1 += starts[7] + " ";
                            pos2 += starts[6] + " ";
                            pos3 += starts[5] + " ";
                            pos4 += starts[6] + " ";
                            pos5 += starts[7] + " ";
                            break;
                        case 'л':
                            pos1 += starts[14] + " ";
                            pos2 += starts[11] + " ";
                            pos3 += starts[11] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[7] + " ";
                            break;
                        case 'м':
                            pos1 += starts[15] + " ";
                            pos2 += starts[16] + " ";
                            pos3 += starts[2] + " ";
                            pos4 += starts[15] + " ";
                            pos5 += starts[15] + " ";
                            break;
                        case 'н':
                            pos1 += starts[15] + " ";
                            pos2 += starts[15] + " ";
                            pos3 += starts[2] + " ";
                            pos4 += starts[15] + " ";
                            pos5 += starts[15] + " ";
                            break;
                        case 'о':
                            pos1 += starts[0] + " ";
                            pos2 += starts[7] + " ";
                            pos3 += starts[7] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'п':
                            pos1 += starts[0] + " ";
                            pos2 += starts[7] + " ";
                            pos3 += starts[7] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[7] + " ";
                            break;
                        case 'р':
                            pos1 += starts[0] + " ";
                            pos2 += starts[7] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[9] + " ";
                            pos5 += starts[9] + " ";
                            break;
                        case 'с':
                            pos1 += starts[0] + " ";
                            pos2 += starts[9] + " ";
                            pos3 += starts[9] + " ";
                            pos4 += starts[9] + " ";
                            pos5 += starts[0] + " ";
                            break;
                        case 'т':
                            pos1 += starts[17] + " ";
                            pos2 += starts[18] + " ";
                            pos3 += starts[18] + " ";
                            pos4 += starts[18] + " ";
                            pos5 += starts[18] + " ";
                            break;
                        case 'у':
                            pos1 += starts[15] + " ";
                            pos2 += starts[19] + " ";
                            pos3 += starts[18] + " ";
                            pos4 += starts[20] + " ";
                            pos5 += starts[21] + " ";
                            break;
                        case 'ф':
                            pos1 += starts[22] + " ";
                            pos2 += starts[2] + " ";
                            pos3 += starts[22] + " ";
                            pos4 += starts[18] + " ";
                            pos5 += starts[18] + " ";
                            break;
                        case 'х':
                            pos1 += starts[15] + " ";
                            pos2 += starts[19] + " ";
                            pos3 += starts[18] + " ";
                            pos4 += starts[19] + " ";
                            pos5 += starts[15] + " ";
                            break;
                        case 'ц':
                            pos1 += starts[6] + " ";
                            pos2 += starts[6] + " ";
                            pos3 += starts[6] + " ";
                            pos4 += starts[1] + " ";
                            pos5 += starts[12] + " ";
                            break;
                        case 'ч':
                            pos1 += starts[7] + " ";
                            pos2 += starts[7] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[12] + " ";
                            pos5 += starts[12] + " ";
                            break;
                        case 'ш':
                            pos1 += starts[2] + " ";
                            pos2 += starts[2] + " ";
                            pos3 += starts[2] + " ";
                            pos4 += starts[2] + " ";
                            pos5 += starts[17] + " ";
                            break;
                        case 'щ':
                            pos1 += starts[2] + " ";
                            pos2 += starts[2] + " ";
                            pos3 += starts[2] + " ";
                            pos4 += starts[17] + " ";
                            pos5 += starts[23] + " ";
                            break;
                            /* Не уверен что еть  ФИО на  следующие 3 бувы */
                        case 'ь':
                            pos1 += starts[9] + " ";
                            pos2 += starts[9] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[7] + " ";
                            pos5 += starts[0] + " ";
                            break;

                        case 'ъ':
                            pos1 += starts[24] + " ";
                            pos2 += starts[20] + " ";
                            pos3 += starts[25] + " ";
                            pos4 += starts[26] + " ";
                            pos5 += starts[25] + " ";
                            break;


                        case 'ы':
                            pos1 += starts[15] + " ";
                            pos2 += starts[15] + " ";
                            pos3 += starts[30] + " ";
                            pos4 += starts[31] + " ";
                            pos5 += starts[30] + " ";
                            break;
                        case 'э':
                            pos1 += starts[1] + " ";
                            pos2 += starts[12] + " ";
                            pos3 += starts[0] + " ";
                            pos4 += starts[12] + " ";
                            pos5 += starts[1] + " ";
                            break;
                        case 'ю':
                            pos1 += starts[27] + " ";
                            pos2 += starts[28] + " ";
                            pos3 += starts[28] + " ";
                            pos4 += starts[28] + " ";
                            pos5 += starts[27] + " ";
                            break;
                        case 'я':
                            pos1 += starts[29] + " ";
                            pos2 += starts[26] + " ";
                            pos3 += starts[29] + " ";
                            pos4 += starts[26] + " ";
                            pos5 += starts[15] + " ";
                            break;


                    }

              }


/**                     Вариант 2
               if (name.charAt(i)== 'a')
                    {
                        pos1 += starts[1]+ " ";
                        pos2=pos2+starts[2]+" ";
                        pos3=pos3+starts[0]+" ";
                        pos4=pos4+starts[2]+" ";
                        pos5=pos5+starts[2]+" ";


                    }

                if (name.charAt(i)=='l') {
                    pos1 += starts[1] + " ";
                    pos2 = pos2 + starts[2] + " ";
                    pos3 = pos3 + starts[0] + " ";
                    pos4 = pos4 + starts[2] + " ";
                    pos5 = pos5 + starts[2] + " ";
                }
 */
            }


	    System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
        System.out.println(pos4);
        System.out.println(pos5);
    }
}
