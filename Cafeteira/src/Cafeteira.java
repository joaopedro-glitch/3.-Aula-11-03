public class Cafeteira {
    public boolean ligada;
    public int quantidadeCafe;
    public int quantidadeAgua;

    public Cafeteira(){
        ligada = false;
        quantidadeCafe = 0;
        quantidadeAgua = 0;
    }

    public void ligar(){
        if(!ligada){    
            ligada = true;
        }
    }
    
    public void desligar(){
        if(ligada){    
            ligada = false;
        }
    }

    public void encherCafe(int quantidadeCafe){
        if (quantidadeCafe > 0) {
            this.quantidadeCafe += quantidadeCafe;
        }
    }

    public void encherAgua(int quantidadeAgua){
        if (quantidadeAgua > 0) {
            this.quantidadeAgua += quantidadeAgua;
        }
    }

    public boolean fazerCafe(){
        if (ligada = true && quantidadeCafe >= 7 && quantidadeAgua >= 30 ) {
            quantidadeCafe -= 7;
            quantidadeAgua -= 30;
            return true;
        }
        else{ 
            return false;
        }
    }

    public void status() {
        System.out.println("Status da Cafeteira:");
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Quantidade de Café: " + quantidadeCafe + "g");
        System.out.println("Quantidade de Água: " + quantidadeAgua + "ml");
        System.out.println();
    }

}
