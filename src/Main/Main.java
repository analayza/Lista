package Main;

import Model.ListaDeDesejos;
import Model.ProdutoModel;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ProdutoModel[] listaProduto = new ProdutoModel[]; // dessa forma temos que passar uma quantidade limite.

        //ArrayList<ProdutoModel> listaDeProdutos = new ArrayList<>(); //Vem Pronto, pode criar a instancia

        ListaDeDesejos<ProdutoModel> padaria = new ListaDeDesejos<>();

       ProdutoModel pastel = new ProdutoModel("Pastel de frango",3.50,2,20);

        padaria.add(pastel);
        System.out.println("Quantidade de elementos na lista: " + padaria.size());
        System.out.println(padaria);

        padaria.remove(pastel);
        System.out.println(padaria);
        System.out.println("Quantidade de elementos na lista: " + padaria.size());

        //List<ProdutoModel> = new List<ProdutoModel>();  //Não podemos criar uma instancia com ele
    }
}
