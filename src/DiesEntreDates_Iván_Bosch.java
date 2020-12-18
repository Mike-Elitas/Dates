/*
    Created by Ivan
    in 18/12/2020
    Description: Interpretation of the date differential calculus.
*/
public class DiesEntreDates_Iván_Bosch extends CalcularDiesEntreDates{

    //Builder
    public DiesEntreDates_Iván_Bosch() {
    }

    //Imported methods
    @Override
    protected int diesMes(int mes) {
        return 0;
    }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        return 0;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {
        return 0;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        return 0;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        return 0;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected boolean anyDeTraspas(int any) {
        return false;
    }

    public final int nombreDiesTotals(DataXS datainicial, DataXS datadesti) {
        return this.diesMesInicial(datainicial)+
                this.diesResteAnyInicial(datainicial)+
                this.diesNumAnysComplets(datainicial,datadesti)+
                this.diesResteAnyDesti(datadesti)+
                this.diesMesDesti(datadesti)+
                this.numDiesPerAnysdeTraspas(datainicial,datadesti);
    }
}
