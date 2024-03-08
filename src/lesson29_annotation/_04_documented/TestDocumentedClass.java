package lesson29_annotation._04_documented;

public class TestDocumentedClass {
    @TestDocumented(doTestDocument = "Hello from Documented")
    public void doSomeDocumented() {
        System.out.println("Test for Documented annotqation");
    }

    @TestNotDocumented(doTestNotDocumented = "Hello from Not Documented")
    public void doSomeNotDocumented() {
        System.out.println("Test for NotDocumented annotqation");
    }
}
