package Composicao.Exemplo1;

import java.awt.desktop.OpenURIEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento: ");
        Departamento departamentoTrabalhador = new Departamento(sc.next());

        System.out.println("DADOS DO TRABALHADOR:");

        System.out.println("Digite o nome: ");
        String nomeTrabalhador = sc.next();

        System.out.println("Digite o level: ");
        Level levelTrabalhador = Level.valueOf(sc.next());

        System.out.println("Digite o salario base: ");
        double salarioBaseTrabalhador = sc.nextDouble();


        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, levelTrabalhador, salarioBaseTrabalhador, departamentoTrabalhador);

        System.out.println("Quantos contratos tera o trabalhador ? ");
        int quantidadeContratos = sc.nextInt();

        for (int i = 0; i < quantidadeContratos; i++) {

            Date dataContrato = null;
            System.out.printf("Digite a data do contrato %d: ", i);

            try {
                dataContrato = sdf.parse(sc.next());
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use DD/MM/YYYY.");
                i--; // Repetir a iteração se a data for inválida
                continue;
            }

            System.out.printf("Digite o valor por hora do contrato %d: ", i);
            double valorPorHora = sc.nextDouble();

            System.out.printf("Digite a duracão do contrato %d: ", i);
            Integer duracao = sc.nextInt();

            ContratoHora contratoHora = new ContratoHora(dataContrato, valorPorHora, duracao);

            trabalhador.adicionarContrato(contratoHora);
        }
/*
        System.out.println("Digite o Mes: ");
        int mesCalculo = sc.nextInt();
        System.out.println("Digite o Ano: ");
        int anoCalculo = sc.nextInt();
*/
        //OU

        System.out.println(" ");
        System.out.println("Digite a data no formato MM/YYYY: ");
        String dataCalculo = sc.next();

        int mesCalculo = Integer.parseInt(dataCalculo.substring(0, 2));
        int anoCalculo = Integer.parseInt(dataCalculo.substring(3));

        System.out.printf("Os ganhos no mes %d e ano %d foi de : %.2f", mesCalculo, anoCalculo, trabalhador.ganhos(anoCalculo, mesCalculo));


    }
}
