import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        List<Integer> array= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array.add(random.nextInt(10,1000));
        }
        System.out.println(array);
        List<Integer> newArray= array.stream().filter(n-> n>500).collect(Collectors.toList());
        System.out.println(newArray);
        Chetnye chetnye= new Chetnye();
        chetnye.chet();
        Str str= new Str();
        str.stroka();


        Phone phone= new Phone(123,"stac");
        Phone phone1= new Phone(321,"mob");

        List<Client> clients= new ArrayList<>();
        Client client= new Client(56,"Alex",32,phone);
        Client client1= new Client(12,"Bek",62,phone1);
        Client client2= new Client(89,"Max",45,phone);
        Client client3= new Client(44,"Andreas",25,phone);

        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        List<Client>clients1= clients.stream().filter(x-> x.getPhone().getType()=="stac").collect(Collectors.toList());

        Optional<Client> clientOld = clients1.stream().max(Comparator.comparing(Client::getAge));
        System.out.println(clientOld);
        clientOld.ifPresent(System.out::println);
    }

}
class Chetnye {
    public void chet() {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array.add(random.nextInt(10,1000));
        }
        System.out.println(array);
        long r = array.stream().filter(n->n%2==0).count();
        System.out.println(r);
    }
}
class Str{
    public void stroka(){
        List<String> array= new ArrayList<>();
        List<String> array1= new ArrayList<>();
        int chisloLength=10;
        int strLength=6;
        for (int i = 0; i < chisloLength; i++) {
            array.add(randomStr(strLength));
        }
        for (String s :array) {
            array1.add(s + IntStream.range(0, s.length())
                    .mapToObj(i -> s.charAt(s.length() - i - 1))
                    .map(String::valueOf)
                    .collect(Collectors.joining()));
        }
        System.out.println(array1);
    }
    public String randomStr(int length){
        char [] alphabet= new char[52];
        int count= 0;
        for (int i = 'A'; i < 'Z'; i++) {
            alphabet[count] = (char) i;
            count++;
        }
        for (int i = 'a'; i < 'z'; i++) {
            alphabet[count] = (char) i;
            count++;
        }
        String word="";
        Random random= new Random();
        for (int i = 0; i < length; i++) {
            word+=alphabet[random.nextInt(alphabet.length)];
        }
        return word;
    }

}