package b_design_pattern.b_structure.d_adapter_design_pattern.example_4;

// 在我们的项目中，外部系统A的使用示例
    public class Demo {
        private IA a;

        public Demo(IA a) {
            this.a = a;
        }
        //...
    }