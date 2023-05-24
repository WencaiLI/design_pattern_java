package b_design_pattern.b_structure.d_adapter_design_pattern.example_4;

public class BAdaptor implements IA {
    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    public void fa() {
        //...
        b.fb();
    }
}