public class JavaInterface {
    
    public interface Simpatico {
        public void cumprimentar();
    }

    public class Matilha {

        public void separar() {
            
            class Cao implements Simpatico {
    
                @Override
                public void cumprimentar() {
                    System.out.println("Au au!");
                }
            }
        }

    }
}
