/*
    Created by Ivan
    in 18/12/2020
    Description: Interpretation of the date differential calculus.
*/
public class DiesEntreDates_Iván_Bosch extends CalcularDiesEntreDates{

    //Builder
    public DiesEntreDates_Iván_Bosch() {
    }
    int diesMesInicial;
    int diesMesDesti;
    int diesMes;
    int diesResteAnyInicial;
    int diesResteAnyDesti;
    int diesNumAnysComplets;
    boolean anyDeTraspas;

    @Override
    protected int diesMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                this.diesMes = 31;
                break;
            case 2:
                this.diesMes=28;
                break;
            case 4: case 6: case 9: case 11:
                this.diesMes = 30;
                break;
        }
        return this.diesMes;
    }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        this.diesMesInicial = diesMes(dataXS.mes) - dataXS.dia;
        return this.diesMesInicial;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {
        this.diesMesDesti = dataXS.dia;
        return this.diesMesDesti;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        datainicial.mes++;
        while (datainicial.mes <= 12){
            this.diesResteAnyInicial += diesMes(datainicial.mes);
            datainicial.mes++;
        }
        return this.diesResteAnyInicial;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        datadesti.mes--;
        while (datadesti.mes >= 1){
            this.diesResteAnyDesti += diesMes(datadesti.mes);
            datadesti.mes--;
        }
        return this.diesResteAnyDesti;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        this.diesNumAnysComplets = ((datadesti.any - datainicial.any) -1) * 365;
        return this.diesNumAnysComplets;
    }

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diaTraspas = 0;
        for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
            if (anyDeTraspas(datainicial.any + i)){
                diaTraspas++;
            }
        }
        if (anyDeTraspas(datadesti.any)){
            diaTraspas++;
        }
        return diaTraspas;
    }

    @Override
    protected boolean anyDeTraspas(int any) {
        if (any % 400 == 0 || ((any % 4 == 0) && !(any % 100 == 0))){
            this.anyDeTraspas = true;
        }
        else this.anyDeTraspas = false;

        return this.anyDeTraspas;
    }
}