package zhenya.workshop_12.task_1;

public class Executor {
    public static void main(String[] args) {
        RegularGermanVerb verb1 = new RegularGermanVerb("hören");
        verb1.getPraesens();
        verb1.getPraeteritum();
        verb1.getImperativ();
        verb1.getPartizipZwei();

        RegularGermanVerb verb2 = new RegularGermanVerb("brauchen");
        verb2.getPraesens();
        verb2.getPraeteritum();
        verb2.getImperativ();
        verb2.getPartizipZwei();

        RegularGermanVerb verb3 = new RegularGermanVerb("sagen");
        verb3.getPraesens();
        verb3.getPraeteritum();
        verb3.getImperativ();
        verb3.getPartizipZwei();
    }
}
