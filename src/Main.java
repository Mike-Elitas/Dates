/*
    Created by Ivan
    in 18/12/2020
    Description: Executes the calculus of the class "DiesEntreDates_Iván_Bosch"
*/
public class Main {
    public static void main(String[] args) {
        DiesEntreDates_Iván_Bosch d1=new DiesEntreDates_Iván_Bosch();
        try {
            DataXS dataInici=new DataXS("11/02/2012");
            DataXS dataFinal=new DataXS("12/02/2013");
            System.out.println("There is a "+d1.nombreDiesTotals(dataInici,dataFinal)+" day differential including both days.");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


}
