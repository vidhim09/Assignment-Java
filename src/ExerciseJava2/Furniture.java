package ExerciseJava2;

interface Test{
    public void fireTest(Material m);
    public void stressTest(Material m);
}

class Material{
    void wood(){

    }

    void steel(){

    }
}

public class Furniture extends Material{

}

class Chair extends Furniture implements Test{

    @Override
    public void fireTest(Material m) {

    }

    @Override
    public void stressTest(Material m) {

    }
}

class Table extends Furniture implements Test{

    @Override
    public void fireTest(Material m) {

    }

    @Override
    public void stressTest(Material m) {

    }
}