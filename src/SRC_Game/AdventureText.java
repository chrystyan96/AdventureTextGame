
package SRC_Game;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdventureText implements Runnable{
    
    private Socket client;
    
    public AdventureText(Socket client){
        this.client = client;
    }
    
    @Override
    public void run() {
        try {
            Scanner read = new Scanner(this.client.getInputStream());
            PrintWriter write = new PrintWriter(this.client.getOutputStream(), true);
            
            write.println("A CAVERNA -"
                    + "Digite 1 para continuar -"
                    + "Digite 0 para sair");
            
            while (true){
                String text = "";
                String s = read.nextLine().toUpperCase();
                if(s.equalsIgnoreCase("0")){
                    break;
                } else{
                    switch (s){
                        case "1":
                            text = "Você está em uma caverna e vê dois buracos que podem ser escalados. -"
                                    + "O que você vai fazer??? -"
                                    + "Digite 1A para escalar o buraco da esquerda-"
                                    + "Digite 2A para escalar o buraco da direita";
                            write.println(text);
                                break;
                            
                        case "1A":
                            text = "Você vê uma lagoa na sala mal iluminada.-"
                                    + "Há uma luz vindo de dentro da lagoa.-"
                                    + "Há também outro buraco para escalar.-"
                                    + "O que você vai fazer??? -"
                                    + "Digite 1B para mergulhar na lagoa -"
                                    + "Digite 2B para escalar o outro buraco";
                            write.println(text);
                            break;
                            
                        case "2A":
                            text = "Você se encontra em um abismo vertical.- Você pode subir ou descer. -"
                                    + "O que você vai fazer??? -"
                                    + "Digite 3A para subir -"
                                    + "Digite 4A para descer";
                            write.println(text);
                            break;
                            
                        case "1B":
                            text = "Você mergulha profundamente e através de um buraco submerso,-"
                                    + "você é levado a outra sala da caverna quando você submerge.-"
                                    + "Digite 1C para sair da agua";
                            write.println(text);
                            break;
                            
                        case "2B":
                            text = "O buraco faz um loop em torno de um arco e se conecta com outro túnel na caverna-."
                                    + "Você sente partes do piso rangendo e se movendo embaixo de você enquanto anda.-"
                                    + "RUN ==> 5A-"
                                    + "PISE COM CUIDADO ==> 6A";
                            write.println(text);
                            break;
                            
                        case "1C":
                            text = "A escuridão nesta sala estão ficando mais forte e-"
                                    + "você começa a gritar para ver se o eco lhe-"
                                    + "dirá o tamanho do espaço em que você se encontra. -"
                                    + "Digite 1D para continuar gritando -"
                                    + "Digite 2D para andar pelo escuro";
                            write.println(text);
                            break;
                            
                        case "2D":
                            text = "Você anda pelo escuro e vê uma pequena luz brilhante a distância.- "
                                    + "Ao se aproximar dela, percebe que encontrou um elevador e-"
                                    + "essa luz vem de um botão -"
                                    + "Digite 2Z para usar o elevador";
                             write.println(text);
                            break;
                            
                        case "1D":
                            text = "Depois de gritar por algum tempo você ouve algo gritar de volta,-"
                                    + "e depois disso tudo ficou eternamente escuro. YOU DIED!!! -"
                                    + "ISSO NÃO É BOM ==> Digite 1Z";
                            write.println(text);
                            break;
                        
                        case "3A":
                            text = "Você não pode dizer se está vendo fantasmas ou neblina,-"
                                    + "mas é difícil ver através dessas nuvens em movimento.-"
                                    + "Você sente o seu caminho ao longo da parede e pensa que"
                                    + " encontrou uma superfície plana e lisa.-"
                                    + "Digite 3B para examinar a superfície -"
                                    + "Digite 4B para continuar procurando.";
                            write.println(text);
                            break;
                            
                        case "3B":
                            text = "Você examina a superfície e descobre um botão redondo. -"
                                    + "Você pressiona o botão.-Uma porta secreta se abre. -"
                                    + "Você entra na sala com um piso plano e paredes.-"
                                    + "Tem um brilho laranja iluminando-o.-"
                                    + "Você achou ==> Digite 2Z?";
                            write.println(text);
                            break;
                            
                        case "4A":
                            text = "A escuridão nesta sala estão ficando mais forte e-"
                                    + "você começa a gritar para ver se o eco lhe-"
                                    + "dirá o tamanho do espaço em que você se encontra. -"
                                    + "Digite 1D para continuar gritando -"
                                    + "Digite 2D para andar pelo escuro";
                            write.println(text);
                            break;
                            
                        case "4B":
                            text = "Você continua caminhando até que o solo embaixo ceda e seu"
                                    + " estômago se levante e o vento passe por seus ouvidos.-"
                                    + "ISSO NÃO É BOM ==> Digite 1Z";
                            write.println(text);
                            break;

                        case "5A":
                            text = "Você corre e o túnel sobe em um declive e ao redor em uma espécie de "
                                    + "escada em espiral feita de pedras.-"
                                    + "CONTINUA CORRENDO ---> 5B";
                            write.println(text);
                            break;
                        
                        case "5B":
                            text = "Você não pode dizer se está vendo fantasmas ou neblina,"
                                    + " mas é difícil ver através dessas nuvens em movimento. -"
                                    + "Você sente o seu caminho ao longo da parede e pensa que"
                                    + " encontrou uma superfície plana e lisa.-"
                                    + "Digite 3B para examinar a superfície -"
                                    + "Digite 4B para continuar procurando.";
                            write.println(text);
                            break;
                            
                        case "6A":
                            text = "Você continua caminhando até que o solo embaixo ceda e seu"
                                    + " estômago se levante e o vento passe por seus ouvidos.-"
                                    + "ISSO NÃO É BOM ---> Digite 1Z";
                            write.println(text);
                            break;
                            
                        case "1Z":
                            text = "Os ecos do seu último grito foram tudo o que você ouviu antes"
                                    + " que a escuridão eterna o atingisse."
                                    + " YOU DIED!!! -"
                                    + "Digite 1 para jogar de novo-"
                                    + "Digite 0 para sair";
                            write.println(text);
                            break;
                            
                        case "2Z":
                            text = "Quando seus olhos se ajustam, você começa a ver que existem "
                                    + "instrumentos científicos na sala.-"
                                    + "Você encontra a máquina do tempo que você precisa! -"
                                    + "YOU WIN -"
                                    + "Digite 1 para jogar de novo-"
                                    + "Digite 0 para sair";
                            write.println(text);
                            break;
                            
                        default:
                            write.println(text);
                            break;
                    }
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(AdventureText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

