public class Triangulo {
    public float base;
    public float altura;

    public float area(){
        return (base * altura)/2;
    }

    @Override
    public String toString(){
        return "Área = " + area();
    }


}
