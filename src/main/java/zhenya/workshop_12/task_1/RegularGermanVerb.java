package zhenya.workshop_12.task_1;

public class RegularGermanVerb {

    String initialVerb = "";

    RegularGermanVerb(String verb) {
        initialVerb = verb;
        System.out.println("\nVerb: " + initialVerb);
    }


    public void getPraesens() {
        Praesens praesens = new Praesens();
        System.out.println("Präsens: " + praesens.transformTo(initialVerb));
    }

    public void getPraeteritum() {
        Praeteritum praeteritum = new Praeteritum();
        System.out.println("Präteritum: " + praeteritum.transformTo(initialVerb));
    }

    public void getImperativ() {
        Imperativ imperativ = new Imperativ();
        System.out.println("Imperative: " + imperativ.transformTo(initialVerb));
    }

    public void getPartizipZwei() {
        PartizipZwei partizipZwei = new PartizipZwei();
        System.out.println("Partizip Zwei: " + partizipZwei.transformTo(initialVerb));
    }

    private class Praesens {

        protected String transformTo(String initialVerb) {
            return initialVerb;
        }
    }

    private class Praeteritum {

        protected String transformTo(String initialVerb) {
            return String.format(initialVerb.substring(0, initialVerb.length() - 2) + "ten");
        }
    }

    private class Imperativ {

        protected String transformTo(String initialVerb) {
            return initialVerb;
        }
    }

    private class PartizipZwei {

        protected String transformTo(String initialVerb) {
            return String.format("ge" + initialVerb.substring(0, initialVerb.length() - 2) + "t");
        }
    }
}
