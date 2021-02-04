import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
class Main{
    public static void main(String[] args){
        try{
            Random rand = new Random();
            ArrayList<Integer> numeros = new ArrayList<Integer>();
            String ruta = "numero.txt";
            String contenido;
            StringBuilder builder = new StringBuilder();
            boolean ciclo = true;
            //generar 3000 datos aleatorios
            for(int i=0;i<3000;i++){
                int aleatorio = rand.nextInt(6000);
                do{
                    if(numeros.contains(aleatorio)){
                        aleatorio = rand.nextInt(6000);
                    }else{
                        numeros.add(aleatorio);
                        ciclo=false;
                    }
                }while(ciclo);               
            }

            //guardar los numeros en string
            for(Integer item : numeros){
                builder.append(item + " ");
            }
            contenido = builder.toString();

            //realizar la creacion del file y guardarlo en ella
            File file = new File(ruta);
            if(!file.exists()){
                file.createNewFile();
            }
            //escritura
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        //menu para escoger el tipo de sorting

    }
}