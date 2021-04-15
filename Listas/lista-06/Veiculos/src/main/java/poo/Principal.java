package poo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Ferrari("FerrariSpider"));
        listaVeiculos.add(new Pampa("PampaS"));
        listaVeiculos.add(new Panther("CarBoat"));

        for (Veiculo v: listaVeiculos){
            if(v instanceof Ferrari) {
                if (((Ferrari) v).abrirCapota()) {
                    System.out.println(" Capota aberta!!");
                }
                if (((Ferrari) v).LigarVeiculo()) {
                    System.out.println(" Carro ligado!");
                }
                if (((Ferrari) v).ligarFarolNeblina()) {
                    System.out.println(" Farol ligado!");
                }
                System.out.println("\n");
            }

            if(v instanceof Pampa) {
                if(((Pampa) v).abrirCacamba()){
                    System.out.println(" Caçamba aberta!!");
                }
                if(((Pampa) v).ativarDesativarTracao()){
                    System.out.println(" Tração ativada!");
                }
                if(!((Pampa) v).ativarDesativarTracao()){
                    System.out.println(" Tração desativada!");
                }
                System.out.println("\n");
            }

            if(v instanceof Panther) {
                if(((Panther) v).LigarVeiculo()){
                    System.out.println(" Carro ligado!");
                }
                if(((Panther) v).recolherRodas()){
                    System.out.println(" Rodas recolhidas!");
                }
                if(((Panther) v).abrirCapota()){
                    System.out.println(" Capota aberta!!");
                }
                if(((Panther) v).fecharCapota()){
                    System.out.println(" Capota fechada!!");
                }else{
                    System.out.println(" Capota aberta!!");
                }

            }
        }
    }
}
